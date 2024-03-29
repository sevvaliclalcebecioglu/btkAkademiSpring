package com.btkakademi.project.hibernateAndJpa.business;

import com.btkakademi.project.hibernateAndJpa.entities.City;

import java.util.List;

public interface CityService
{
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
