package com.project.secrettalk.entity;

import lombok.*;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    @Column(length = 255, nullable = false)
    private Long id;

    @Column(length = 255, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(nullable = false)
    private Long birth_year;

    @Column(length = 5, nullable = false)
    private String gender;

    @Column(length = 5, nullable = true)
    private String state;

    @Column(name = "regdate_time")
    private LocalDateTime reg_datetime;

    @Column(name = "block_datetime")
    private LocalDateTime block_datetime;
}
