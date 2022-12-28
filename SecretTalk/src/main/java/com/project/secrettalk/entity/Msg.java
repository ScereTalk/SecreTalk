package com.project.secrettalk.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Msg {
    @Id
    @Column(length = 255, nullable = false)
    private Long msg_id;

    @Column(length = 255, nullable = false)
    private String msg_from;

    @Column(length = 255, nullable = false)
    private String msg_to;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @Column(length = 20, nullable = false)
    private String imoji;

    @Column(length = 5, nullable = true)
    private String state;

    @Column(name = "regdate_time")
    private LocalDateTime reg_datetime;

    @Column(name = "read_datetime")
    private LocalDateTime read_datetime;
}
