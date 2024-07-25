package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.*;
import org.choongang.board.entities.BoardData;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

import java.util.List;

@Builder
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
//@Table(name="CH_MEMBER")
/*
@Table(indexes = {
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="uq_email_password", columnList = "email, password", unique = true)
})
 */
public class Member extends BaseEntity {
    @Id @GeneratedValue // 자동 증감
    private Long seq;

    @Column(length=60 ,nullable = false, unique = true)
    private String email;

    @Column(length=65 ,nullable = false)
    private String password;

//    @Column(name="name")  // 실제 DB에 저장되어 있는 필드명
    @Column(length=40, nullable = false)
    private String userName;

    // @Lob
    @Transient
    private String introduction;

    @Column(length=10)
    @Enumerated(EnumType.STRING)
    private Authority authority;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="profile_seq")
    private MemberProfile profile;

    @ToString.Exclude
    @OneToMany(mappedBy = "member")
    private List<BoardData> items;
}
