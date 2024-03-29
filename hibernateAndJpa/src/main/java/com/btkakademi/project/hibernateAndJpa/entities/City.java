package com.btkakademi.project.hibernateAndJpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "city")
@Entity  // veri tabanı nesnesi olduğunu anlatır.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "district")
    private String district;

    @Column(name = "population")
    private int population;
}
