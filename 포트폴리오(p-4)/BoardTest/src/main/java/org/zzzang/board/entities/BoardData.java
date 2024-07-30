package org.zzzang.board.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData {
    @Id @GeneratedValue
    private Long seq;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;
}
