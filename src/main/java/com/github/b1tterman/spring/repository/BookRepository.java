package com.github.b1tterman.spring.repository;

import com.github.b1tterman.spring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface BookRepository extends JpaRepository<Book, Long> {

public interface BookRepository extends CrudRepository<Book, Long> {
}
