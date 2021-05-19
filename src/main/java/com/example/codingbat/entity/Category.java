package com.example.codingbat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String categoryname;
    @ManyToMany
    private List<Language> languages;
    @OneToMany
    private List<Query> query;

    public Category(String categoryname, List<Language> languages, List<Query> query) {
        this.categoryname = categoryname;
        this.languages = languages;
        this.query = query;
    }
}
