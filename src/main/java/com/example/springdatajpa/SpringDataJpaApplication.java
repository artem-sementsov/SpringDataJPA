package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {
    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            System.out.println(repository.findEmployeesByLastNameContaining(" "));
        };
    }

    private void insertFourEmployees(EmployeeRepository repository) {
        repository.save(new Employee("Dalia", "Abo Sheasha"));
        repository.save(new Employee("Trisha", "Gee"));
        repository.save(new Employee("Helen", "Scott"));
        repository.save(new Employee("Mala", "Gupta"));
    }

    public static void main(String[] args) throws ClassNotFoundException {
        SpringApplication.run(SpringDataJpaApplication.class, args);
        Class.forName("org.postgresql.Driver");

    }


}
