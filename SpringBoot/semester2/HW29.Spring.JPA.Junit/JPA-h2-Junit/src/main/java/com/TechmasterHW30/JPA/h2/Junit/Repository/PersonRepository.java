package com.TechmasterHW30.JPA.h2.Junit.Repository;

import com.TechmasterHW30.JPA.h2.Junit.Entiry.Person;
import com.TechmasterHW30.JPA.h2.Junit.QueryModels.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    //    Đếm số người theo từng công việc theo thứ tự giảm dần
    @Query
            (
                    "SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.CountPeopleByJob(p.job, COUNT(*))" +
                    " FROM person AS p" +
                    " GROUP BY p.job" +
                    " ORDER BY 2 DESC"
            )
    List<CountPeopleByJob> CountPeopleByJob();

    //    Đếm top 5 công việc có nhiều người làm nhất
    @Query
        (
                "SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.CountPeopleByJob(p.job, COUNT(*))" +
                " FROM person AS p" +
                " GROUP BY p.job" +
                " ORDER BY 2 DESC"
        )
    List<CountPeopleByJob> CountPersonByJobTop5(Pageable pageable);

    //    Đếm số lượng người nhóm theo từng công việc và cùng thành phố
    @Query
        (
                "SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.CountGroupByJobAndCity(p.job,p.city, COUNT(*)) " +
                " FROM person AS p " +
                "GROUP BY p.job, p.city " +
                "ORDER BY 3 DESC"
        )
    List<CountGroupByJobAndCity>countGroupByJobAndCity();

    //Mức lương trung bình theo từng công việc thứ tự giảm dần
    @Query
        (
                "SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.AvgSalaryGroupJob(p.job, AVG(p.salary)) "+
                "FROM person AS p GROUP BY p.job ORDER BY 2 DESC"
        )
    List<AvgSalaryGroupJob> avgSalaryByJob();

    //Mức lương trung bình theo từng thành phố thứ tự giảm dần
    @Query
    (
        "SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.AvgSalaryGroupCity(p.city, AVG(p.salary)) "+
        "FROM person AS p GROUP BY p.city ORDER BY 2 DESC"
    )
    List<AvgSalaryGroupCity> avgSalaryByCity();

    //Đếm 5 thành phố cos nhiều công việc A nhất
    @Query("SELECT new com.TechmasterHW30.JPA.h2.Junit.QueryModels.CityHasMostOfAJob(job, city, COUNT(job)) " +
            "FROM person GROUP BY city HAVING job = ?1 ORDER BY 3 DESC")
    List<CityHasMostOfAJob> topCitiesHasAJob(String job, Pageable pageable);
    //https://stackoverflow.com/questions/2129693/using-limit-within-group-by-to-get-n-results-per-group
}
