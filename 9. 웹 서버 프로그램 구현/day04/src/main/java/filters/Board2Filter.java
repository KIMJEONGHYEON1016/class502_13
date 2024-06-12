package filters;


import jakarta.servlet.*;

import java.io.IOException;

public class Board2Filter implements Filter {

    @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        chain.doFilter(request, response);

    }
}
