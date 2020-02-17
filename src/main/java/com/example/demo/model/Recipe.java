package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity
public class Recipe {
    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60, nullable = false)
    private String title;

    @Column
    private Duration prepTime;

    @CreationTimestamp
    @Column(updatable = false)
    private Date created;

    @Column(nullable = false)
    private String ingredients;

    @Column(nullable = false)
    private String prepMethod;

    public Recipe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Duration prepTime) {
        this.prepTime = prepTime;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPrepMethod() {
        return prepMethod;
    }

    public void setPrepMethod(String prepMethod) {
        this.prepMethod = prepMethod;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", prepTime='" + prepTime + '\'' +
                '}';
    }
}
