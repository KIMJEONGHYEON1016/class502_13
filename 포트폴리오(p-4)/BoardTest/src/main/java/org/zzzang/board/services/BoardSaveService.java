package org.zzzang.board.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zzzang.board.controllers.RequestBoardData;
import org.zzzang.board.entities.BoardData;
import org.zzzang.board.repositories.BoardRepository;

@Service
@RequiredArgsConstructor
public class BoardSaveService {
    private final BoardRepository boardRepository;

    public void save(RequestBoardData form) {
        BoardData data = new ModelMapper().map(form, BoardData.class);
        boardRepository.saveAndFlush(data);
    }
}
