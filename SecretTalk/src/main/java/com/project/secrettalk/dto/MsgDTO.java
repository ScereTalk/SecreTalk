package com.project.secrettalk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MsgDTO {

    private Long msg_id;

    private String msg_from;

    private String msg_to;

    private String title;

    private String contents;

    private String imoji;

    private String state;

    private LocalDateTime reg_datetime;

    private LocalDateTime read_datetime;
}
