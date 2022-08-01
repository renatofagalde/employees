package br.com.likwi.employeedemo.configuration;

import br.com.likwi.employeedemo.dao.EmployeeRepository;
import br.com.likwi.employeedemo.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {

        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + employeeRepository.save(new Employee("Frodo Baggins", "thief")));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));
        };

    }
}
