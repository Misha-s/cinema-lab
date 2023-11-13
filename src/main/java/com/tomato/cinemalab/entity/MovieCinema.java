package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "movie_cinema")
public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date_time;


    public MovieCinema(String date_time) {
        this.date_time = date_time;
    }

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> ticket;
}
