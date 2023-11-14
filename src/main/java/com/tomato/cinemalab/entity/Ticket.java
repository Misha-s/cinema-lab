package com.tomato.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "ticket")
public class Ticket extends BaseEntity{

    private int rowNumber;
    private int seatNumber;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate dateTime;



    @ManyToOne(fetch = FetchType.LAZY)
    private UserAccount userAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;


}
