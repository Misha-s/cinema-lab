package com.tomato.cinemalab.entity;

import com.tomato.cinemalab.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
public class AccountDetails extends BaseEntity{

    private String address;
    private int age;
    private String city;
    private String country;
    private String name;
    private String postal_code;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String state;


    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "address='" + address + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", role=" + role +
                ", state='" + state + '\'' +
                ", userAccount=" + userAccount +
                "}";
    }
}
