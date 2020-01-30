package servlet;

import domain.Salary;
import service.SalaryService;
import service.impl.SalaryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteSalary")
public class deleteSalary extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset = UTF-8");

        int id = Integer.parseInt(request.getParameter("id"));

        SalaryService service = new SalaryServiceImpl();

        service.deleteSalary(id);
        response.sendRedirect("/searchSalary");
    }
}
