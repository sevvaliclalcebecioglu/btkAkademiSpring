package com.btkakademi.project.hibernateAndJpa.restApi;

import com.btkakademi.project.hibernateAndJpa.business.CityService;
import com.btkakademi.project.hibernateAndJpa.entities.City;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city){
        cityService.add(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }

    @GetMapping("/cities/{id}")
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }
}
