package com.example.model.repository;

import com.example.model.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book,Integer> {
}
