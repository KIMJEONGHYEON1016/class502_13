package org.choongang.member.services;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;

//객체 조립기
public class MemberServiceProvider {
    private static MemberServiceProvider instance;

    private MemberServiceProvider() {}

    public static MemberServiceProvider getInstance() {
        if (instance == null) {
            instance = new MemberServiceProvider();
        }
        return instance;
    }

    public SqlSession getSession() {    //변경된 세션 가져오기
        return DBConn.getSession();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberMapper());
    }

    public LoginValidator loginValidator() {
        return new LoginValidator(memberMapper());
    }

    public MemberMapper memberMapper() {
        return getSession().getMapper(MemberMapper.class);
    }


    public JoinService joinService() {
        return new JoinService(joinValidator(), memberMapper());
    }

    public LoginService loginService() {
        return new LoginService(loginValidator(), memberMapper());
    }
}
