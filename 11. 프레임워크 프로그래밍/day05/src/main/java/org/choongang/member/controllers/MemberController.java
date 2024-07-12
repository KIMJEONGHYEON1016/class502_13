package org.choongang.member.controllers;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {

//    private final Logger log = LoggerFactory.getLogger(MemberController.class);


    @GetMapping("/join")
    public String join1() {
        log.info("{}, {} 없음", "mode1", "mode2");
        return "member/join";
    }

    @GetMapping(path= "/join", params={"mode=join"})
    public String join() {
        log.info("mode=join");
        return "member/join";
    }

    @PostMapping(path = "/join", headers = "appKey=1234", consumes = "application/json")
    public String joinPs(RequestJoin form) {

        log.info("joinPs 실행 ...");

        return "redirect:/member/login";
    }
    /*
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕 하세요");
        mv.setViewName("member/join");

        return mv;
    }
    */
}
