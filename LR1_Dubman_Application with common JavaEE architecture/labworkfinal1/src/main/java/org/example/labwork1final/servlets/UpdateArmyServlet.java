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
@WebServlet(name = "UpdateArmyServlet", value = "/UpdateArmyServlet", urlPatterns = "/update-army")
public class UpdateArmyServlet extends HttpServlet {
    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long armyId = Long.parseLong(request.getParameter("armyId"));
        Army army = appBean.getArmyById(armyId);
        request.setAttribute("army", army);
        request.getRequestDispatcher("view/UpdateArmy.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long armyId = Long.parseLong(request.getParameter("armyId"));
        String name = request.getParameter("nameArmy");
        appBean.updateArmy(armyId, new Army(name));
        response.sendRedirect(request.getContextPath() + "/armys");
    }
}
