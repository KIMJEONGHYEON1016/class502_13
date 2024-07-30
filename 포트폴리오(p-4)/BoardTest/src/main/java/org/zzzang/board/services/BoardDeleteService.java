package org.zzzang.board.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zzzang.board.repositories.BoardRepository;

@Service
@RequiredArgsConstructor
public class BoardDeleteService {
    private final BoardRepository boardRepository;

    public void delete(Long seq) {
        boardRepository.deleteById(seq);
        boardRepository.flush();
    }
}
