package ru.gb.homework_8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.homework_8.model.Book;

public interface BookStoreRepository extends JpaRepository<Book, Long> {

}
