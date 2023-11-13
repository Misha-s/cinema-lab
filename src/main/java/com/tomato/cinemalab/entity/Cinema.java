package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String  name, sponsored_name;

    public Cinema(String name, String sponsored_name) {
        this.name = name;
        this.sponsored_name = sponsored_name;
    }

    @ManyToOne()
    private Location location;

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;
}
