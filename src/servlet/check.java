package servlet;

import domain.Manager;
import domain.Message;
import domain.User;
import service.ManagerService;
import service.MessageService;
import service.UserService;
import service.impl.ManagerServiceImpl;
import service.impl.MessageServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check")
public class check extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = UTF-8");

        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();

        ManagerService ms = new ManagerServiceImpl();
        UserService us=new UserServiceImpl();
        Manager manager = new Manager();
        User user=new User();

        String username = request.getParameter("name");
        String password = request.getParameter("pwd");
        int id = us.findId(username);


        session.setAttribute("username", username);
        session.setAttribute("id", id);
//        System.out.println("getAttribute(id):" + session.getAttribute("id"));
        manager.setUsername(username);
        manager.setPassword(password);
        user.setUsername(username);
        user.setPassword(password);


        if (ms.checkManager(manager)) {
            response.sendRedirect("mainpage.jsp");
//            request.getRequestDispatcher("mainpage.jsp").forward(request, response);
        } else if (us.checkUser(user)) {
            response.sendRedirect("mainpageforuser.jsp");
//            request.getRequestDispatcher("mainpageforuser.jsp").forward(request, response);
        }else {
            pw.write("<script language='javascript'>" + "alert('用户名或密码有误！请检查并重新登录！！！');" + "window.location='login.jsp'" + "</script>");
        }
    }
}

