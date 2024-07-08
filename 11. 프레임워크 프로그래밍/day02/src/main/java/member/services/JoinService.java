package member.services;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import member.controllers.RequestJoin;
import member.dao.MemberDao;
import member.entities.Member;
import member.validators.JoinValidator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class JoinService {


    private final JoinValidator validator;

    @NonNull
    private MemberDao memberDao;

    // 의존 관계 - 없으면 객체 생성 X



    /*
    // 연관 관계 - 없어도 객체는 생성 된다.
    public void setValidator(JoinValidator validator) {
        this.validator = validator;
    }
    */
    public void process(RequestJoin form) {
        validator.check(form);  // joinService 는 validator 객체, form 객체를 의존 -> 의존성

        // 데이터 영구 저장 - DAO(Data Access Object)
        Member member = Member.builder()
                .email(form.getEmail())
                .password(form.getPassword())
                .userName(form.getUserName())
                .regDt(LocalDateTime.now())
                .build();

        memberDao.register(member);
    }
}