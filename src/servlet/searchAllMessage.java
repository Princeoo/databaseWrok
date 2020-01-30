package servlet;


import service.MessageService;
import service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/searchallmessage")
public class searchAllMessage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");

        MessageService ms = new MessageServiceImpl();


        request.getSession().setAttribute("messages", ms.findAllMessage());
        if(Integer.parseInt(request.getParameter("sign")) == 666)
            request.getRequestDispatcher("messagecrud.jsp").forward(request, response);
        else if (Integer.parseInt(request.getParameter("sign")) == 888)
            request.getRequestDispatcher("messagesearch.jsp").forward(request, response);
    }
}
