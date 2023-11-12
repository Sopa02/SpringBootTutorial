package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Mari = new Student(
                    "Mari",
                    LocalDate.of(2002,1,2),
                    "mari.amil@gmail.com"
            );
            Student Jamal = new Student(
                    "Jamal",
                    LocalDate.of(1930,5, 2),
                    "jamalino98@gmail.com"
            );

            studentRepository.saveAll( List.of(Mari,Jamal) );
        };
    }
}
