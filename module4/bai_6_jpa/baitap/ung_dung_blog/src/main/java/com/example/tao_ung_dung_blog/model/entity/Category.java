package com.example.tao_ung_dung_blog.model.entity;

import org.hibernate.annotations.GenericGenerators;

import javax.persistence.*;
import java.util.List;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "category")
     private List<Blog> blogList;

    public Category(Integer id, String name, List<Blog> blogList) {
        this.id = id;
        this.name = name;
        this.blogList = blogList;
    }

    public Category(String name, List<Blog> blogList) {
        this.name = name;
        this.blogList = blogList;
    }

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
