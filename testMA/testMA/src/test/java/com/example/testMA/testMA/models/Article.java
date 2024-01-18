package com.example.testMA.testMA.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "tb_m_articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private String uniqueID;

    @Column(name = "Title", length = 100)
    private String title;

    @Column(name = "Slug", length = 100)
    private String slug;

    @Column(name = "Body", columnDefinition = "TEXT")
    private String body;

    @Column(name = "Banner", columnDefinition = "TEXT")
    private String banner;

    @Column(name = "Image", columnDefinition = "TEXT")
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type", length = 10)
    private ArticleType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", length = 10)
    private ArticleStatus status;

    @Column(name = "IsSlideShow")
    private boolean isSlideShow;

    @Column(name = "Counter")
    private int counter;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Updated_at")
    private Date updatedAt;

    @Column(name = "Product_id")
    private String productID;

    @Column(name = "User_id")
    private String userID;

    public enum ArticleType {
        KNOWLEDGE,
        NEWS,
        PROMO
    }

    public enum ArticleStatus {
        PUBLISHED,
        DRAFT,
        DELETED
    }
}
