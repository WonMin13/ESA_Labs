<%@ page import="java.util.List" %>
<%@ page import="org.example.labwork1final.model.Album" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update album</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<%
    List<Long> armyIds = (List<Long>) request.getAttribute("armyIds");
    Album album = (Album) request.getAttribute("album");
%>
<div class="container w-50">
    <form method="post" action="${pageContext.request.contextPath}/update-album">
        <h1>Update Album</h1>
        <input type="hidden" name="albumId" value="<%= album.getId() %>">
        <div class="form-group">
            <label for="nameAlbum">Name Album: </label>
            <input class="form-control" id="nameAlbum" name="nameAlbum" type="text" value="<%= album.getNameAlbum() %>"
                   required/>
        </div>
        <div class="form-group">
            <label for="song">Song: </label>
            <input class="form-control" id="song" name="song" type="text" value="<%= album.getSong() %>"
                   required/>
        </div>
        <div class="form-group">
            <label for="price">Price: </label>
            <input class="form-control" id="price" name="price" type="number" value="<%= album.getPrice() %>"
                   required>
        </div>
        <div class="form-group">
            <label for="armyId">Army Id: </label>
            <select class="form-control" id="armyId" name="armyId" required>
                <% for (Long armyId : armyIds) {%>
                <% if (armyId.equals(album.getArmy().getId())) {%>
                <option value="<%= armyId %>" selected><%= armyId %>
                </option>
                <%} else {%>
                <option value="<%= armyId %>"><%= armyId %>
                </option>
                <%
                        }
                    }
                %>
            </select>
        </div>
        <br>
        <input type="submit" value="Update" class="btn btn-primary"/>
    </form>
</div>
</body>
</html>
