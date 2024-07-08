package board.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements InitializingBean, DisposableBean {

    public void write() {
        System.out.println("글쓰기!");
    }

    @Override
    public void afterPropertiesSet() throws Exception { //new ACAC 했을때
        System.out.println("afterPropertiesSet()!");
    }

    @Override
    public void destroy() throws Exception {    //ctx.close 전에
        System.out.println("destroy()!");
    }
}
