package servlet;

import service.impl.SalaryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/searchAllSalary")
public class searchAllSalary extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
}

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = UTF-8");

        SalaryServiceImpl salaryService = new SalaryServiceImpl();
        System.out.println(request.getParameter("sign"));
        request.getSession().setAttribute("salary", salaryService.findAllSalary());
        if(Integer.parseInt(request.getParameter("sign")) == 666)
            request.getRequestDispatcher("salarycrud.jsp").forward(request, response);
        else if (Integer.parseInt(request.getParameter("sign")) == 888)

            request.getRequestDispatcher("salarysearch.jsp").forward(request, response);
    }

}
