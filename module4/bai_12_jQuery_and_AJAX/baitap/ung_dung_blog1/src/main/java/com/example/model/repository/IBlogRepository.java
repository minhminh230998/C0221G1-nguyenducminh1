package com.example.model.repository;

import com.example.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    @Query(value="select * from blog where category_id = ?",nativeQuery=true)
    Page<Blog>findByIdCategory(Pageable pageable, int id);
    @Query(value="select * from blog order by  `date`",nativeQuery=true)
    Page<Blog>findAll(Pageable pageable);
    @Query(value="select * from blog where `name` like :name",nativeQuery=true)
    Page<Blog>findAllByName(Pageable pageable, @Param("name") String name);
}
