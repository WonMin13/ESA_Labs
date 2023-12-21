package org.example.labwork1final.servlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.labwork1final.ejb.AppBean;
import org.example.labwork1final.model.Army;
import org.example.labwork1final.model.Album;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "CreateAlbumServlet", value = "/CreateAlbumServlet", urlPatterns = "/create-album")
public class CreateAlbumServlet extends HttpServlet {

    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Long> armyIds = appBean.getAllArmys().stream().map(Army::getId).collect(Collectors.toList());
        request.setAttribute("armyIds", armyIds);
        request.getRequestDispatcher("view/CreateAlbum.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameAlbum = request.getParameter("nameAlbum");
        String song = request.getParameter("song");
        Integer price = Integer.parseInt(request.getParameter("price"));
        Long armyId = Long.parseLong(request.getParameter("armyId"));
        appBean.createAlbum(new Album(nameAlbum, song, price), armyId);
        response.sendRedirect(request.getContextPath() + "/albums");
    }
}
