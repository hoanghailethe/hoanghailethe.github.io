package com.TechmasterHW30.JPA.h2.Junit;

import com.TechmasterHW30.JPA.h2.Junit.QueryModels.*;
import com.TechmasterHW30.JPA.h2.Junit.Repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.jdbc.Sql;

import org.springframework.data.domain.Pageable;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql({"/data.sql"})
@Slf4j
public class PersonRepoTest {

    @Autowired
    PersonRepository personRepo;

    @Test
    public void countByJob(){
        List<CountPeopleByJob> peopleList = personRepo.CountPeopleByJob();
        log.info("Top job DESC");
        peopleList.forEach(System.out::println);
        assertThat(peopleList.size()).isGreaterThan(2);
    }

    //https://www.baeldung.com/spring-data-jpa-pagination-sorting
    @Test
    public void CountPersonByJobTop5(){
        Pageable pageable = (Pageable) PageRequest.of(0,5);
        List<CountPeopleByJob> topfiveJobs = personRepo.CountPersonByJobTop5(pageable);
        log.info("TopfiveJob");
        topfiveJobs.forEach(System.out::println);
        assertThat(topfiveJobs.size()).isGreaterThan(4);
    }

    @Test
    public void countGroupByJobAndCity(){
        List<CountGroupByJobAndCity> peopleList = personRepo.countGroupByJobAndCity();
        log.info("nums of people each job in each city");
        peopleList.forEach(System.out::println);
        assertThat(peopleList.size()).isGreaterThan(2);
    }

    @Test
    public void avgSalaryByJob(){
        List<AvgSalaryGroupJob> peopleList = personRepo.avgSalaryByJob();
        log.info("average sal by job");
        peopleList.forEach(System.out::println);
        assertThat(peopleList.size()).isGreaterThan(2);
    }

    @Test
    public void avgSalaryByCity(){
        List<AvgSalaryGroupCity> peopleList = personRepo.avgSalaryByCity();
        log.info("average sal by city");
        peopleList.forEach(System.out::println);
        assertThat(peopleList.size()).isGreaterThan(2);
    }

    @Test
    public void topCitiesHasAJob(){
        Pageable pageable = PageRequest.of(0,5);
        List<CityHasMostOfAJob> peopleList = personRepo.topCitiesHasAJob("Associate Professor", pageable);
        log.info("Top 5 city have most APs");
        peopleList.forEach(System.out::println);
        assertThat(peopleList.size()).isGreaterThan(0);
    }
}
