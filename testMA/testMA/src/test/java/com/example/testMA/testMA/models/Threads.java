package com.example.testMA.testMA.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_m_threads")
public class Threads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private String uniqueID;

    @Column(name = "Title", length = 100)
    private String title;

    @Column(name = "Slug", length = 50)
    private String slug;

    @Column(name = "Counter")
    private int counter;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Updated_at")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "Forum_id")
    private Forum forum;

   
}