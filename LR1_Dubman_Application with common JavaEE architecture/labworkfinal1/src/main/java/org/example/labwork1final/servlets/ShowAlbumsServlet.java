package org.example.labwork1final.servlets;

import org.example.labwork1final.ejb.AppBean;
import org.example.labwork1final.model.Album;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAlbumsServlet", value = "/ShowAlbumsServlet", urlPatterns = "/albums")
public class ShowAlbumsServlet extends HttpServlet {

    @EJB
    AppBean appBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Album> albums = appBean.getAllAlbums();
        request.setAttribute("albums", albums);
        request.getRequestDispatcher("view/ShowAlbums.jsp").forward(request, response);
    }

}
