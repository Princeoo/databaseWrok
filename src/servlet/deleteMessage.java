package servlet;

import dao.impl.MessageDaoImpl;
import service.MessageService;
import service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteMessage")
public class deleteMessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");

        MessageService ms = new MessageServiceImpl();
        String id = request.getParameter("id");
        System.out.println(request.getParameter("id"));
        ms.deleteMessage(Integer.parseInt(id));
        request.getRequestDispatcher("/searchMessage").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
