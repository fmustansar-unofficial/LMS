package com.hexad.lms.model.repo;

import com.hexad.lms.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Book, Long> {
    @Override
    List<Book> findAll();
}
