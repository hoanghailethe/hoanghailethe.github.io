package vn.techmaster.peopledata.repository;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import vn.techmaster.peopledata.model.Person;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

@Repository
public class PersonRepository {
  private List<Person> people = new ArrayList<Person>();

  //Constructor đọc toàn bộ dữ liệu từ JSON vào
  public PersonRepository() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());
    File file;
    try {
      file = ResourceUtils.getFile("classpath:static/person.json");
      people.addAll(mapper.readValue(file, new TypeReference<List<Person>>(){}));      
    } catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {  
      e.printStackTrace();
    }
  }

  public List<Person> getAll() {
    return people;
  }

  //2.1 Nhóm những người trong cùng thành phố lại
  public Map<String, List<Person>> groupPeopleByCity() {
   // https://www.baeldung.com/java-groupingby-collector
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getCity));
  }

  public Map<String, Long> groupByCityThenCount() {
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
  }

  //2.2 Nhóm các nghề nghiệp và đếm số người làm
  public Map<String, Long> groupByJobThenCount() {
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getJob, Collectors.counting()));
  }

  //2.3 Tìm 5 nghề có nhiều người làm nhất, đếm từ cao xuống thấp
  public Map<String, Long> fiveTopJobs() {
    Map<String, Long> jobGroupedThenCount = groupByJobThenCount();
    
    var step1 = jobGroupedThenCount.entrySet();
    
    var step2 = step1
    .stream()
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .limit(5);

    return step2   
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
    (oldValue, newValue) -> oldValue, LinkedHashMap::new
    )); // --> Map<String, Long>
    //.collect(Collectors.toList()); --> List<Map.Entry<String, Long>>

  }

  //2.4 Tìm 5 thành phố có nhiều người trong danh sách ở nhất, đếm từ cao xuống thấp
  public Map<String, Long> fiveTopPopulationCities() {
    //Nhóm theo City sau đó đếm số People trong City
    Map<String, Long> groupByCityThenCount = people
    .stream()
    .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

    
    return groupByCityThenCount.entrySet()  //Chuyển kết quả sang Set<Map.Entry<K, V>>
    .stream() //Với List và Set interface thì chúng ta có stream để duyệt
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  //Sắp xếp theo Value 
    .limit(5)  //Giới hạn 5 phần tử
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
    (oldValue, newValue) -> oldValue, LinkedHashMap::new
    )); //Collectors.toMap để nhặt ra phần tử tạo ra LinkedHashMap mới 
  }

  //Tìm ra nghề nào có nhiều nhất trong một nhóm người bất kỳ
  public Map.Entry<String, Long> topJobInPeopleGroup(List<Person> peopleGroup) {
    Optional<Map.Entry<String, Long>> result = peopleGroup
    .stream()
    .collect(Collectors.groupingBy(Person::getJob, Collectors.counting()))  //Nhóm theo Job
    .entrySet()
    .stream()
    .collect(Collectors.maxBy(Map.Entry.comparingByValue())); //Tìm lớn nhất
    
    if (result.isPresent()) {
      return result.get();
    } else {
      throw new RuntimeException("Cannot find top job in people group");
    }
    
  }
  //2.5 Trong mỗi thành phố, hãy tìm ra nghề nào được làm nhiều nhất
  public Map<String, Map.Entry<String, Long>> topJobByNumerInEachCity() {
    Map<String, List<Person>> groupPeopleByCity = groupPeopleByCity();

    return groupPeopleByCity.entrySet()
    .stream()
    .collect(Collectors.toMap(Map.Entry::getKey, entry -> topJobInPeopleGroup(entry.getValue()))
    /*
    Chuyển đổi Map<City, List<Person>> sang 
    Map<City, <Job, JobCount>>
    */
    );
  }

  //2.6 Ứng với một nghề, hãy tính mức lương trung bình
  public Map<String, Double> averageSalaryByJob() {
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getJob, Collectors.averagingInt(Person::getSalary)));
  }

  //2.7 Năm thành phố có mức lương trung bình cao nhất
  public List<Map.Entry<String,Double>> fiveCitiesHasTopAverageSalary3() {
    Map<String,Double> cityAndAvarageSalary = new HashMap<>();
    cityAndAvarageSalary = people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getSalary)));
    //b2 sap xep lai map vua tao
    return cityAndAvarageSalary
                              .entrySet()
                              .stream()
                              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(5)
                              .collect(Collectors.toList());
  }

  //2.8 Năm thành phố có mức lương trung bình của developer cao nhất
  public List<Map.Entry<String,Double>> fiveCitiesHasTopSalaryForDeveloper() {
    Map<String,Double> cityAndAvarageSalary = new HashMap<>();
    cityAndAvarageSalary = people.stream()
                            .filter(p -> p.getJob().equals("developer"))
                            .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getSalary)));
    //b2 sap xep lai map vua tao
    return cityAndAvarageSalary
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(5)
            .collect(Collectors.toList());
  }

  //2.9 Tuổi trung bình từng nghề nghiệp
  public Map<String, Double> averageAgePerJob() {
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getJob, Collectors.averagingInt(Person::getAge)));
  }

  //2.10 Tuổi trung bình ở từng thành phố
  public Map<String, Double> averageAgePerCity() {
    return people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));
  }

  //2.11 Tuổi cao nhất trong mỗi thành phố
  public List<Map.Entry<String, Integer>> maxAgePerCity2() {
    //tao 1 map gom ten city va 1 NGUOI CO TUOI LON NHAT
    Map <String, Optional<Person>> peopleGroupedByCity = people.stream()
            .collect(Collectors.groupingBy(Person::getCity, Collectors.maxBy(Comparator.comparing(Person::getAge))));
    Map<String,Integer> cityAndMaxAge = new HashMap<>();

    peopleGroupedByCity
                    .entrySet()
                    .forEach(p -> cityAndMaxAge.put(p.getKey(), p.getValue().get().getAge()));
    return cityAndMaxAge.entrySet().stream().collect(Collectors.toList());
  }


  //2.12 tỷ lệ nam / nữ trong toàn bộ dữ liệu
  public Double maleFemaleRatio() {
    int all = people.size();
    List<Person> male = people.stream().filter(p -> p.getGender().equals("Male")).collect(Collectors.toList());
    int maleCount = male.size();
    return maleCount/(double)(all-maleCount);
  }

  //2.13 Tìm thành phố có số lượng lập trình viên cao nhất
  public String cityHasMaxNumberOfDeveloper(){
    //step1: filter Dev - groupBycity - sort - getHighest
    var devCountEachCity = people.stream()
            .filter( p -> p.getJob().equals("developer"))
            .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

    var sortedMap = devCountEachCity
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    var cityHasMostDevs = sortedMap.findFirst().get().getKey();
    return cityHasMostDevs;
  }

  //Test result 2.13
  public List<Map.Entry<String,Long>> TestcityHasMaxNumberOfDeveloper(){
    //step1: filter Dev - groupBycity - sort - getHighest
    var devCountEachCity = people.stream()
            .filter( p -> p.getJob().equals("developer"))
            .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

    var sortedMap = devCountEachCity
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    return sortedMap.collect(Collectors.toList());
  }

  //2.14 Tính tỷ lệ nam/nữ ở mỗi thành phố
  public Map<String, Double> malefemaleRatioInEachCity() {
    var peopleGroupByCity =
            people.stream().collect(Collectors.groupingBy(Person::getCity));
    var malefemaleRatioInEachCity =
            peopleGroupByCity.entrySet().stream()
                  .collect(Collectors.toMap(Map.Entry::getKey,
                                            entry -> {
                                              double male = entry.getValue()
                                                      .stream()
                                                      .filter(t -> t.getGender().equals("Male")).count();
                                              int total = entry.getValue().size();
                                              return 1D*male/(total-male);
                                              }));
    return malefemaleRatioInEachCity;
  }
}
