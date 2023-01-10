package com.javakar.posgressexample.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
@Data
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

}