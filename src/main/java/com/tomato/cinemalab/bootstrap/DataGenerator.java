package com.tomato.cinemalab.bootstrap;

import com.tomato.cinemalab.repository.AccountDetailsRepository;
import com.tomato.cinemalab.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    private final AccountDetailsRepository accountDetailsRepository;
    private final UserRepository userRepository;

    public DataGenerator(AccountDetailsRepository accountDetailsRepository, UserRepository userRepository) {

        this.accountDetailsRepository = accountDetailsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(userRepository.findByEmail("josie_story@email.com"));
        System.out.println(userRepository.findByUsername("bernard"));
    }
}
