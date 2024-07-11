package org.choongang.member.entities.services;


import lombok.RequiredArgsConstructor;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginValidator validator;

}
