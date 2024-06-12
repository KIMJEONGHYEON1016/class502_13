package filters;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/board2")
public class Board2Filter implements Filter {

    @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        chain.doFilter(request, response);

    }
}
