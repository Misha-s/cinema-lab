package com.tomato.cinemalab.entity;

import com.tomato.cinemalab.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "account_details")
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String address;
    private int age;
    private String city;
    private String country;
    private String name;
    private String postal_code;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String state;

    public AccountDetails(String address, int age, String city, String country, String name, String postal_code, Role role, String state) {
        this.address = address;
        this.age = age;
        this.city = city;
        this.country = country;
        this.name = name;
        this.postal_code = postal_code;
        this.role = role;
        this.state = state;
    }

    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;

}
