package com.example.reactspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Yamada", "Tarou", "engineer"));
    }
}
