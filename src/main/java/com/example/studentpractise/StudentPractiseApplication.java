package com.example.studentpractise;

import com.example.studentpractise.entities.Student;
import com.example.studentpractise.repositories.StudentRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;
@SpringBootApplication
public class StudentPractiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentPractiseApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(StudentRepositories studentRepository){
        return args -> {
            studentRepository.save(new Student(null, "Jam", new Date(), false, 1.2));
            studentRepository.save(new Student(null, "Jen", new Date(), true, 3.2));
            studentRepository.save(new Student(null, "Jok", new Date(), false, 1.0));
            studentRepository.save(new Student(null, "Jos", new Date(), false, 4.2));
            studentRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }
}