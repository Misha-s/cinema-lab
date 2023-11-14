package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "location")
public class Location extends BaseEntity{

   private String name, address, postal_code, country, state, city;
   private BigDecimal latitude, longitude;

}
