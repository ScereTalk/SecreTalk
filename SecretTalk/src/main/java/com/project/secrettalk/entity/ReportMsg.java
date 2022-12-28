package com.project.secrettalk.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class ReportMsg {
    @Id
    @Column(length = 255, nullable = false)
    private String msg_id;

    @Column(length = 255, nullable = false)
    private String msg_from;

    @Column(length = 255, nullable = false)
    private String msg_to;

    @Column(name = "regdate_time")
    private LocalDateTime reg_datetime;
}
