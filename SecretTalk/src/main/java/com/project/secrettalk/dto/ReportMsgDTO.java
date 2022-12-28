package com.project.secrettalk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportMsgDTO {

    private String msg_id;

    private String msg_from;

    private String msg_to;

    private LocalDateTime reg_datetime;
}
