package org.zzzang.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    @GetMapping("/list")
    public String list() {
        return "front/board/list";
    }


    @GetMapping("/post")
    public String post(@ModelAttribute RequestBoardData data) {

        return "front/board/post";

    }

    @PostMapping("/post")
    public String postPs(@Valid RequestBoardData data, Errors errors) {

        if (errors.hasErrors()) {
            return "front/board/post";
        }

        return "front/board/post";

    }

    @GetMapping("/update")
    public String update() {
        return "front/board/update";
    }


    @GetMapping("/write")
    public String write() {
        return "front/board/write";
    }
}
