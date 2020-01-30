package servlet;

import domain.Salary;
import service.SalaryService;
import service.WorkingService;
import service.impl.SalaryServiceImpl;
import service.impl.WorkingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteWorking")
public class deleteWorking extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        response.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(request.getParameter("id"));

        WorkingService service = new WorkingServiceImpl();

        service.deleteWorking(id);
        request.getRequestDispatcher("/searchWorking").forward(request, response);
    }
}