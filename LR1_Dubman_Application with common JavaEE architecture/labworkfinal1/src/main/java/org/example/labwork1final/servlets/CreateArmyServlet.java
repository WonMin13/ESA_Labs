package org.example.labwork1final.servlets;

import org.example.labwork1final.model.Army;
import org.example.labwork1final.ejb.AppBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CreateArmyServlet", value = "/CreateArmyServlet", urlPatterns = "/create-army")
public class CreateArmyServlet extends HttpServlet {
    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/CreateArmy.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nameArmy");
        appBean.createArmy(new Army(name));
        response.sendRedirect(request.getContextPath() + "/armys");
    }
}
