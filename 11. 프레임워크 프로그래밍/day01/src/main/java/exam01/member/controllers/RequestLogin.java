package exam01.member.controllers;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RequestLogin {
    private String email;
    private String password;
}
