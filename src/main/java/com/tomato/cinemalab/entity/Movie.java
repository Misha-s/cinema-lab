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
public class Movie extends BaseEntity {

    private Integer duration;
    private String name;
    private BigDecimal price;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    @Column(columnDefinition = "text")
    private String summary;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;


    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genre;

}
