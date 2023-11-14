package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "cinema")
public class Cinema extends BaseEntity{

   private String  name, sponsoredName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;

}
