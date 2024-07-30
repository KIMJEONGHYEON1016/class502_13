package org.zzzang.board.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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
        return boardRepository.findById(seq).orElse(null);
    }
}
