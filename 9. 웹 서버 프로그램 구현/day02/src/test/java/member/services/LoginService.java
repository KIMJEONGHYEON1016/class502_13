package member.services;

import global.Mailer;
import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidtor;

public class LoginService {

    private Validator<HttpServletRequest> validtor;
    private Mailer mailer;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validtor = validator;
    }

    public void setMailer(Mailer mailer) {
        this.mailer = mailer;
    }

    public void process(HttpServletRequest request) {
        validtor.check(request);

        // 로그인 성공 가정
        // 성공시 메일 전송
        if (mailer != null) {
            String email = request.getParameter("email");
            mailer.send(email);
        }
    }
}
