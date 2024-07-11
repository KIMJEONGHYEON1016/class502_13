package org.choongang.member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
//@Table("MEMBER")    //테이블 명과 매핑
public class Member {
    @Id // 기본 키를 알려줌
//    @Column("ID")
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;
}