Homework practice 
===
## Topic: Collection.Stream

---
##Requirement and my Soluion

**2.7 Năm thành phố có mức lương trung bình cao nhất**

Viết hàm ```FiveCitiesHasTopAverageSalary```
```java
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
```

**2.8 Năm thành phố có mức lương trung bình của developer cao nhất**

Viết hàm ```FiveCitiesHasTopSalaryForDeveloper```
```java
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
```
**2.9 Tuổi trung bình từng nghề nghiệp**

Viết hàm ```AverageAgePerJob```
developer - 30.5
secretary - 42
painter - 41
```java
public Map<String, Double> averageAgePerJob() {
    return people
    .stream()
    .collect(Collectors.groupingBy(Person::getJob, Collectors.averagingInt(Person::getAge)));
  }
```

**2.10 Tuổi trung bình ở từng thành phố**
Viết hàm ```AverageAgePerCity```
```java
public Map<String, Double> averageAgePerCity() {
    return people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));
  }
```
**2.11 Tuổi cao nhất trong mỗi thành phố**
```java
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
```

**2.12 tỷ lệ nam / nữ trong toàn bộ dữ liệu**
```java
public Double maleFemaleRatio() {
    int all = people.size();
    List<Person> male = people.stream().filter(p -> p.getGender().equals("Male")).collect(Collectors.toList());
    int maleCount = male.size();
    return maleCount/(double)(all-maleCount);
  }
```

**2.13 Tìm thành phố có số lượng lập trình viên cao nhất**
```java
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
```

**2.14 Tính tỷ lệ nam/nữ ở mỗi thành phố**
```java
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
```

