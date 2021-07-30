package com.example.model.repository.impl;

import com.example.model.entity.Comment;
import com.example.model.repository.CommentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class CommentRepositoryImpl implements CommentRepository {
    @Override
    public List<Comment> findAll() {
        return BaseRepository.entityManager.createQuery("select c from comment c", Comment.class).getResultList();
    }

    @Override
    public Comment findById(Integer id) {
        return BaseRepository.entityManager.find(Comment.class, id);
    }

    @Override
    public void save(Comment comment) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();
    }

    @Override
    public void edit(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        Comment comment=findById(id);
        comment.setLikes(comment.getLikes()+1);
        BaseRepository.entityManager.merge(comment);
        entityTransaction.commit();
    }
}
