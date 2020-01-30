package servlet;

import service.WorkingService;
import service.impl.SalaryServiceImpl;
import service.impl.WorkingServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/searchAllWorking")
public class searchAllWorking extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = UTF-8");

        WorkingService workingService = new WorkingServiceImpl();

        request.getSession().setAttribute("working", workingService.findAllWorking());
        if(Integer.parseInt(request.getParameter("sign")) == 666)
            request.getRequestDispatcher("workingcrud.jsp").forward(request, response);
        else if(Integer.parseInt(request.getParameter("sign")) == 888)
            request.getRequestDispatcher("workingsearch.jsp").forward(request, response);
    }

}
