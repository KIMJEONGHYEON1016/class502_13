package member;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;

}


