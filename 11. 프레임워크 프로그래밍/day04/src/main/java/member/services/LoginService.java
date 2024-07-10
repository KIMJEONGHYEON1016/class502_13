package member.services;

import lombok.RequiredArgsConstructor;
import member.validators.LoginValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginValidator validator;

}
