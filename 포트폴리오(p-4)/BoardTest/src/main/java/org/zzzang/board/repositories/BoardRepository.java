package org.zzzang.board.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.zzzang.board.entities.BoardData;

public interface BoardRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {
}
