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
@Table(name = "tb_m_forums")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniqueID")
    private String uniqueID;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Icon", columnDefinition = "TEXT")
    private String icon;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type", length = 15)
    private ForumType type;

    @ManyToOne
    @JoinColumn(name = "Sub_forum_id")
    private Forum subForum;

    public enum ForumType {
        FORUM,
        SUB_FORUM
    }
}
