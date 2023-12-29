package com.microserviceTP.car.repositories;

import com.microserviceTP.car.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findByClient_Id(Long clientId);
}
