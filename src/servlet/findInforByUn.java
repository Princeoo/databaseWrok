package servlet;

import domain.Manager;
import domain.User;
import service.ManagerService;
import service.UserService;
import service.impl.ManagerServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/findinforbyun")
public class findInforByUn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        String username = String.valueOf(session.getAttribute("username"));
        int id = (int) session.getAttribute("id");
//        System.out.println("getAun"+username);
//        System.out.println("getAid"+id);
        User user = new User();
        Manager manager = new Manager();
        UserService us = new UserServiceImpl();
        ManagerService ms = new ManagerServiceImpl();

        String referer = request.getHeader("referer");
        System.out.println(referer);

        if(referer.equals("http://localhost:8080/mainpage.jsp")){
            request.getSession().setAttribute("managerbyun", ms.findManagerByUsername(username));
            request.getRequestDispatcher("managersearchbyun.jsp").forward(request, response);
//            response.sendRedirect("managersearchbyun.jsp");
        }
        else if(referer.equals("http://localhost:8080/mainpageforuser.jsp")){
            request.getSession().setAttribute("userbyun", us.findUserByUsername(username));
            request.getRequestDispatcher("usersearchbyun.jsp").forward(request, response);
//            response.sendRedirect("usersearchbyun.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
