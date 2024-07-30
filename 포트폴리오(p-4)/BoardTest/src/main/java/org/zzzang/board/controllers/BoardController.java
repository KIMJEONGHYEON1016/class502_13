package org.zzzang.board.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.zzzang.board.entities.BoardData;
import org.zzzang.board.services.BoardInfoService;
import org.zzzang.board.services.BoardSaveService;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardInfoService boardInfoService;
    private final BoardSaveService boardSaveService;

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardData> datas = boardInfoService.getList();
        model.addAttribute("datas", datas);

        return "front/board/list";
    }


    @GetMapping("/post")
    public String post(@ModelAttribute RequestBoardData data) {


        return "front/board/post";

    }


    @GetMapping("/update")
    public String update() {
        return "front/board/update";
    }


    @GetMapping("/content/{seq}")
    public String write(@PathVariable("seq") Long seq, Model model) {
        BoardData data = boardInfoService.get(seq);
        model.addAttribute("data", data);

        return "front/board/content";
    }

    @PostMapping("/save")
    public String save(@Valid RequestBoardData data, Errors errors) {
        boardSaveService.save(data);

        return "redirect:/board/list";
    }
}
