package com.hexad.lms;

import com.hexad.lms.model.Book;
import com.hexad.lms.model.repo.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class Initializer implements CommandLineRunner {

    private final LibraryRepository repository;

    public Initializer(LibraryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Data Structures", "OOP", "Deital & Deital").forEach(name -> repository.save(new Book(name))
        );
//
//        Book djug = repository.findByName("Denver JUG");
////        Event e = Event.builder().title("Full Stack Reactive")
////                .description("Reactive with Spring Boot + React")
////                .date(Instant.parse("2018-12-12T18:00:00.000Z"))
////                .build();
////        djug.setEvents(Collections.singleton(e));
//        repository.save(djug);
//
//        repository.findAll().forEach(System.out::println);
    }
}