package org.choongang.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.choongang.member.entities.services.JoinService;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;
    private final LoginValidator loginValidator;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) {
        // 회원 가입 데이터 검증
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {   // reject, rejectValue 가 한 번 이라도 호출 되면 ture

            return "member/join";
        }

        joinService.process(form);

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form) {

        return "member/login";
    }


    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        loginValidator.validate(form, errors);

        if (errors.hasErrors()) {   // reject, rejectValue 가 한 번 이라도 호출 되면 true
            return "member/login";
        }

        return "redirect:/";
    }

    // 해당 클래스에 공통으로 적용되는 검증
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(joinValidator);
//    }
}
