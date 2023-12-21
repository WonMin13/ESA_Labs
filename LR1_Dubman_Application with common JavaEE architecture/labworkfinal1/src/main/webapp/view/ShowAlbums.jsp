<%@ page import="org.example.labwork1final.model.Album" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BTS Albums</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<% List<Album> albums = (List<Album>) request.getAttribute("albums"); %>
<div class="container">
    <ul class="nav justify-content-center">
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/armys">Show armys</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/albums">Show albums</a>
        </li>
    </ul>
    <table class="table table-striped table-dark table-hover">
        <caption style="caption-side: top">BTS Albums</caption>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name Album</th>
            <th>Song</th>
            <th>Price</th>
            <th>Army</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <% for (Album album : albums) { %>
        <tr>
            <td><%= album.getId() %>
            </td>
            <td><%= album.getNameAlbum() %>
            </td>
            <td><%= album.getSong() %>
            </td>
            <td><%= album.getPrice() %>
            <td><%= album.getArmy().getId() %>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/update-album">
                    <input type="hidden" name="albumId" value="<%= album.getId() %>">
                    <input type="submit" class="btn btn-primary" value="Update">
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/delete-album" method="post">
                    <input type="hidden" name="albumId" value="<%= album.getId() %>">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </form>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <form action="${pageContext.request.contextPath}/create-album" method="get">
        <button class="btn btn-primary">Create Album</button>
    </form>
</div>
</body>
</html>
