package servlet;

import domain.Message;
import service.MessageService;
import service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addMessage")
public class addMessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter pw = response.getWriter();
        MessageService ms = new MessageServiceImpl();
        Message message = new Message();

        message.setName(request.getParameter("name"));
        message.setAge(Integer.parseInt(request.getParameter("age")));
        message.setSex(request.getParameter("sex"));
        message.setPhone_num(request.getParameter("phone"));
        message.setIdentity(request.getParameter("identity"));
        message.setDepart_id(request.getParameter("departID"));
        ms.addMessage(message);

        response.sendRedirect("/searchMessage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
