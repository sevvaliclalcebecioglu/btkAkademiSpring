package com.btkakademi.project.hibernateAndJpa.dataAccess;

import com.btkakademi.project.hibernateAndJpa.entities.City;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CityDal {
    List<City> getAll();

    void add(City city);

    void update(City city);

    void delete(City city);
    City getById(int id);


}
