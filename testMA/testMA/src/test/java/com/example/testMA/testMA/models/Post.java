package com.example.testMA.testMA.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_m_posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private String uniqueID;

    @Column(name = "Body", columnDefinition = "TEXT")
    private String body;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", length = 10)
    private PostStatus status;

    @ManyToOne
    @JoinColumn(name = "Thread_id")
    private Thread thread;

    @Column(name = "Title", length = 100)
    private String title;

    public enum PostStatus {
        ACCEPT,
        REJECT,
        PENDING
    }
}
