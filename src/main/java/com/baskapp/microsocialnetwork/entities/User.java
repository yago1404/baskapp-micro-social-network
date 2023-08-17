package com.baskapp.microsocialnetwork.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity()
@Table(name = "`user`")
@Getter
@Setter
public class User {

    @Id
    @Column(columnDefinition = "integer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "character varying")
    private String name;

    @Column(nullable = false, columnDefinition = "character varying")
    private String email;

    @Column(nullable = false, columnDefinition = "character varying")
    private String password;

    @Column(precision = 6, scale = 2)
    private BigDecimal height;

    @Column(precision = 6, scale = 2)
    private BigDecimal weight;

    @Column(precision = 6, scale = 2)
    private BigDecimal wingspan;

    @Column(nullable = false)
    private Integer rule;

    @Column(nullable = false, columnDefinition = "timestamp without time zone")
    private Date birthday;

    @Column(columnDefinition = "character varying")
    private String lastRefreshToken;

    public User() {
    }
}
