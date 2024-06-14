package board.controllers;

import board.entities.BoardData;
import board.services.BoardInfoService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/board/list/*")
public class BoardListController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BoardInfoService service = new BoardInfoService();
        List<BoardData> items = service.getList();

        req.setAttribute("items", items);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>이전 출력 테스트</h1>");

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/list.jsp");
        rd.forward(req, resp);
    }
}
