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
import java.io.PrintWriter;

@WebServlet("/addSalary")
public class addSalary extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

}

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");

        PrintWriter pw = response.getWriter();
        SalaryService as = new SalaryServiceImpl();
        Salary salary = new Salary();

        salary.setId(Integer.parseInt(request.getParameter("id")));
        salary.setYear(Integer.parseInt(request.getParameter("year")));
        salary.setMonth(Integer.parseInt(request.getParameter("month")));
        salary.setDepart_id(request.getParameter("depart_id"));
        salary.setBase_pay(Float.valueOf(request.getParameter("base_pay")));
        salary.setHouse_add(Float.valueOf(request.getParameter("house_add")));
        salary.setShould_pay(Float.valueOf(request.getParameter("should_pay")));
        salary.setDeduct_pay(Float.valueOf(request.getParameter("deduct_pay")));
        salary.setActual_pay(Float.valueOf(request.getParameter("actual_pay")));
        as.addSalary(salary);

        response.sendRedirect("/searchSalary");
    }
}
