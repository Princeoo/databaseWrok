package servlet;

import service.MessageService;
import service.SalaryService;
import service.impl.MessageServiceImpl;
import service.impl.SalaryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/findusermessage")
public class findUserMessage extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        request.setCharacterEncoding("utf-8");

        HttpSession session=request.getSession();
        String username=request.getParameter("username");


        MessageService messageService = new MessageServiceImpl();

        request.getSession().setAttribute("mbi",
                messageService.findMessageById((Integer) session.getAttribute("id")));
        request.getRequestDispatcher("usermsearch.jsp").forward(request,response);
    }
}