package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "genre")
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genre")
    private List<Movie> movie;
}
