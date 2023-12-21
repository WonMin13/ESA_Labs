package org.example.labwork1final.servlets;

import org.example.labwork1final.ejb.AppBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DeleteArmyServlet", value = "/DeleteArmyServlet", urlPatterns = "/delete-army")
public class DeleteArmyServlet extends HttpServlet {

    @EJB
    AppBean appBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long armyId = Long.parseLong(request.getParameter("armyId"));
        appBean.deleteArmy(armyId);
        response.sendRedirect(request.getContextPath() + "/armys");
    }
}
