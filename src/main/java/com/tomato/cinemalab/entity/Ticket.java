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
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int row_number;
    private int seat_number;
    private LocalDate date_time;

    public Ticket(int row_number, int seat_number, LocalDate date_time) {
        this.row_number = row_number;
        this.seat_number = seat_number;
        this.date_time = date_time;
    }

    @ManyToOne
    private UserAccount userAccount;

    @ManyToOne
    private MovieCinema movieCinema;


}
