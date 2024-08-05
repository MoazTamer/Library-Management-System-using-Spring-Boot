package com.moaz.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moaz.Library.untity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
