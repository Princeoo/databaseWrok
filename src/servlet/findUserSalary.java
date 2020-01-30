package servlet;

import service.SalaryService;
import service.UserService;
import service.impl.SalaryServiceImpl;
import service.impl.UserServiceImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/findusersalary")
public class findUserSalary extends HttpServlet {
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

        SalaryService salaryService = new SalaryServiceImpl();

        request.getSession().setAttribute("sbi",
                salaryService.findSalaryById((Integer) session.getAttribute("id")));
        request.getRequestDispatcher("userssearch.jsp").forward(request,response);
    }
}