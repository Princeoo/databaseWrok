package servlet;

import service.SalaryService;
import service.WorkingService;
import service.impl.SalaryServiceImpl;
import service.impl.WorkingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/finduserworking")
public class findUserWorking extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        HttpSession session=request.getSession();
        String username=request.getParameter("username");


        WorkingService workingService = new WorkingServiceImpl();


        request.getSession().setAttribute("wbi",
                workingService.findWorkingById((Integer) session.getAttribute("id")));
        request.getRequestDispatcher("userwsearch.jsp").forward(request,response);
    }
}