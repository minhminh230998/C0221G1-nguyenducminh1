package com.example.model.repository;

import com.example.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuestionRepository extends PagingAndSortingRepository<Question,Integer> {
@Query(value="select * from question join question_type on question.question_type_id=question_type.id where `title` like %?1% and question_type.name like %?2% order by date_create" ,nativeQuery=true)
    Page<Question> findQuestionByTitleAndAndQuestionTypeName(Pageable pageable, String title, String nameQuestionType);

}
