package com.tomato.cinemalab.entity;

import com.tomato.cinemalab.enums.State;
import com.tomato.cinemalab.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int duration;
    private String name;
    private BigDecimal price;
    private LocalDate release_date;
    @Enumerated(EnumType.STRING)
    private State state;
    private String summary;
    @Enumerated(EnumType.STRING)
    private Type type;

    public Movie(int duration, String name, BigDecimal price, LocalDate release_date, State state, String summary, Type type) {
        this.duration = duration;
        this.name = name;
        this.price = price;
        this.release_date = release_date;
        this.state = state;
        this.summary = summary;
        this.type = type;
    }

    // movie_cinema_id,
    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinema;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genre;

}
