package com.example.tao_ung_dung_blog.model.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;

//    @Column(columnDefinition = "LONGTEXT",length = 3000)
    private String content;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    public Blog(int id, String name, String content, Category category) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.category = category;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
