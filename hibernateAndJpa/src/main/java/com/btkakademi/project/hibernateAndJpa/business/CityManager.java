package com.btkakademi.project.hibernateAndJpa.business;

import com.btkakademi.project.hibernateAndJpa.dataAccess.CityDal;
import com.btkakademi.project.hibernateAndJpa.entities.City;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CityManager implements CityService{

    private CityDal cityDal;

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        //business
        this.cityDal.add(city);

    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);

    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);

    }

    @Override
    public City getById(int id) {
        return this.cityDal.getById(id);
    }
}
