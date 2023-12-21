package org.example.labwork1final.servlets;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.labwork1final.ejb.AppBean;

import java.io.IOException;

@WebServlet(name = "DeleteAlbumServlet", value = "/DeleteAlbumServlet", urlPatterns = "/delete-album")
public class DeleteAlbumServlet extends HttpServlet {
    @EJB
    AppBean appBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long albumId = Long.parseLong(request.getParameter("albumId"));
        appBean.deleteAlbum(albumId);
        response.sendRedirect(request.getContextPath() + "/albums");
    }
}
