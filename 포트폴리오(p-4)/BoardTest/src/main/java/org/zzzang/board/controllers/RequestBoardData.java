package org.zzzang.board.controllers;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestBoardData {
    private Long seq;

    @NotBlank @Size(min = 2, max = 15)
    private String title;

    @NotBlank @Size(min = 1, max = 500)
    private String content;
}
