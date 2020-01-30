package servlet;

import dao.impl.MessageDaoImpl;
import domain.Manager;
import domain.User;
import service.ManagerService;
import service.MessageService;
import service.UserService;
import service.impl.ManagerServiceImpl;
import service.impl.MessageServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
     response.setContentType("text/html; charset = UTF-8");

        PrintWriter pw = response.getWriter();
        UserService us = new UserServiceImpl();
        ManagerService ms = new ManagerServiceImpl();
        User user = new User();
        Manager manager = new Manager();

        String username = request.getParameter("name");
        String password = request.getParameter("pwd");
        String pwdcheck = request.getParameter("pwdcheck");
        String identity = request.getParameter("identity");
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(username + password + identity);

        if (password.equals(pwdcheck)) {
            if(identity.equals("用户")){
                user.setUsername(username);
                user.setPassword(password);
                user.setId(id);
                us.addUser(user);
            }
            else if (identity.equals("管理员")){
                manager.setUsername(username);
                manager.setPassword(password);
                ms.addUser(manager);
            }
            pw.write("<script language='javascript'>" + "alert('注册成功，请重新登录！！！');" + "window.location='login.jsp'" + "</script>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
