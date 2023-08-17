package com.baskapp.microsocialnetwork.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity()
@Table(name = "`user`")
public class User {

    @Id
    @Column(columnDefinition = "integer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, columnDefinition = "character varying")
    public String name;

    @Column(nullable = false, columnDefinition = "character varying")
    public String email;

    @Column(nullable = false, columnDefinition = "character varying")
    private String password;

    @Column(precision = 6, scale = 2)
    public BigDecimal height;

    @Column(precision = 6, scale = 2)
    public BigDecimal weight;

    @Column(precision = 6, scale = 2)
    public BigDecimal wingspan;

    @Column(nullable = false)
    public Integer rule;

    @Column(nullable = false, columnDefinition = "timestamp without time zone")
    public Date birthday;

    @Column(columnDefinition = "character varying")
    public String lastRefreshToken;

    public User() {
    }
}
