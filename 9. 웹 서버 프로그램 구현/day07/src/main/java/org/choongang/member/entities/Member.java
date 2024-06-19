package org.choongang.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long userNo;
    private String password;
    private String email;
    private String userName;
    private LocalDateTime regDt;
    private LocalDateTime modDt;

}
