package com.btkakademi.project.hibernateAndJpa.dataAccess;

import com.btkakademi.project.hibernateAndJpa.entities.City;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@AllArgsConstructor
public class HibernateCityDal implements CityDal{

    private EntityManager entityManager;

    @Override
    @Transactional  // AOP --> Aspect Oriented Programming
    public List<City> getAll() {
       Session session = entityManager.unwrap(Session.class);
        List<City> cities = session.createQuery("from City",City.class).getResultList();
        return cities;
    }

    @Override
    public void add(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);

    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(city);

    }

    @Override
    public City getById(int id) {
        Session session = entityManager.unwrap(Session.class);

        City city = session.get(City.class, id);
        return city;
    }

}
