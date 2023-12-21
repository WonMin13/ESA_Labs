package org.example.labwork1final.servlets;

import org.example.labwork1final.ejb.AppBean;
import org.example.labwork1final.model.Army;
import org.example.labwork1final.model.Album;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "UpdateAlbumServlet", value = "UpdateAlbumServlet", urlPatterns = "/update-album")
public class UpdateAlbumServlet extends HttpServlet {

    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long albumId = Long.parseLong(request.getParameter("albumId"));
        Album album = appBean.getAlbumById(albumId);
        request.setAttribute("album", album);
        List<Long> armyIds = appBean.getAllArmys().stream().map(Army::getId).collect(Collectors.toList());
        request.setAttribute("armyIds", armyIds);
        request.getRequestDispatcher("view/UpdateAlbum.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long albumId = Long.parseLong(request.getParameter("albumId"));
        String nameAlbum = request.getParameter("nameAlbum");
        String song = request.getParameter("song");
        Integer price = Integer.parseInt(request.getParameter("price"));
        Long armyId = Long.parseLong(request.getParameter("armyId"));
        appBean.updateAlbum(albumId, new Album(nameAlbum, song, price), armyId);
        response.sendRedirect(request.getContextPath() + "/albums");
    }

}
