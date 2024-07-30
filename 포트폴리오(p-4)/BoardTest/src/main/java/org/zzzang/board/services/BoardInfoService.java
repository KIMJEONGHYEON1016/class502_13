package org.zzzang.board.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zzzang.board.controllers.RequestBoardData;
import org.zzzang.board.entities.BoardData;
import org.zzzang.board.repositories.BoardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardInfoService {
    private final BoardRepository boardRepository;


    public List<BoardData> getList() {
        return boardRepository.findAll();
    }

    public BoardData get(Long seq) {
        BoardData data = boardRepository.findById(seq).orElse(null);

        return data;
    }

    public RequestBoardData getForm(Long seq) {
        BoardData bData = get(seq);
        RequestBoardData data = new ModelMapper().map(bData, RequestBoardData.class);

        // 2차 가공

        return data;
    }
}
