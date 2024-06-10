package member.services;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidtor;

public class LoginService {

    private Validator<HttpServletRequest> validtor;

    public LoginService(Validator<HttpServletRequest> validtor) {
        this.validtor = validator;
    }

    public void process(HttpServletRequest request) {
        validtor.check(request);
    }
}
