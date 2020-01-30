package servlet;

import domain.Working;
import service.WorkingService;
import service.impl.WorkingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addWorking")
public class addWorking  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("utf-8");
        request.setCharacterEncoding("utf-8");

        PrintWriter pw = response.getWriter();
        WorkingService aw = new WorkingServiceImpl();
        Working working = new Working();

        working.setId(Integer.parseInt(request.getParameter("id")));
        working.setYear(Integer.parseInt(request.getParameter("year")));
        working.setMonth(Integer.parseInt(request.getParameter("month")));
        working.setDepart_id(request.getParameter("depart_id"));
        working.setLate_day(Float.valueOf(request.getParameter("late_day")));
        working.setEarly_day(Float.valueOf(request.getParameter("early_day")));
        working.setLeave_day(Float.valueOf(request.getParameter("leave_day")));
        working.setAdd_hour(Float.valueOf(request.getParameter("add_hours")));

        aw.addWorking(working);

        response.sendRedirect("/searchWorking");
    }
}