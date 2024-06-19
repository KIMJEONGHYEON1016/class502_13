package org.choongang.member.services;

import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;

public class JoinService {

    private Validator<RequestJoin> validator;

    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process(RequestJoin form) {
        //유효성 검사
        validator.check(form);
    }
}
