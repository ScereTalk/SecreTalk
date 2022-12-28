package com.project.secrettalk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO implements Serializable {

    private Long id;

    private String email;

    private String password;

    private Long birth_year;

    private String gender;

    private String state;

    private LocalDateTime reg_datetime;

    private LocalDateTime block_datetime;
}
