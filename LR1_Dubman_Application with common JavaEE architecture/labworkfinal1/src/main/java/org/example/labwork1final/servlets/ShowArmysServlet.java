package org.example.labwork1final.servlets;

import org.example.labwork1final.ejb.AppBean;
import org.example.labwork1final.model.Army;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowArmysServlet", value = "/ShowArmysServlet", urlPatterns = "/armys")
public class ShowArmysServlet extends HttpServlet {

    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Army> armys = appBean.getAllArmys();
        request.setAttribute("armys", armys);
        request.getRequestDispatcher("view/ShowArmys.jsp").forward(request, response);
    }

}