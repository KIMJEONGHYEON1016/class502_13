package org.choongang.member.controllers;

import lombok.RequiredArgsConstructor;
import org.choongang.member.validators.JoinValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final JoinValidator joinValidator;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form, Errors errors) {
        // 회원 가입 데이터 검증
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {   // reject, rejectValue 가 한 번 이라도 호출 되면 ture
            return "member/join";
        }

        return "redirect:/member/login";
    }
}
