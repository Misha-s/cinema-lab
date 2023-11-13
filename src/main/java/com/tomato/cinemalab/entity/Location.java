package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String name, address, postal_code, country, state, city;

    public Location(String name, String address, String postal_code, String country, String state, String city) {
        this.name = name;
        this.address = address;
        this.postal_code = postal_code;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    @OneToMany(mappedBy = "location")
    private List<Cinema> cinema;
}
