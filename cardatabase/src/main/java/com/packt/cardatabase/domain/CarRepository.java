package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

//*                                                 <Entity, id type>
public interface CarRepository extends CrudRepository<Car, Long> {
}
