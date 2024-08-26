package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//*                                                 <Entity, id type>
public interface CarRepository extends CrudRepository<Car, Long> {

    /*

    * Example of defined queries in Spring Boot using findBy and orderBy and @Query

    // Fetch cars by brand
    List<Car> findByBrand(String brand);

    // Fetch cars by color
    List<Car> findByColor(String color);

    // Fetch cars by model year
    List<Car> findByModelYear(int modelYear);

    // Fetch cars by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    // Fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);

    // Fetch cars by brand and sort by year
    List<Car> findByBrandOrderByModelYearAsc(String brand);

    // Fetch cars by brand using SQL
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);


     */

}
