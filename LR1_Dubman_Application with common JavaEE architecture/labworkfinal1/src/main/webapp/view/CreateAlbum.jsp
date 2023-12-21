<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create album</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<% List<Long> armyIds = (List<Long>) request.getAttribute("armyIds"); %>
<div class="container w-50">
    <form method="post" action="${pageContext.request.contextPath}/create-album">
        <h1>Create album</h1>
        <div class="form-group">
            <label for="nameAlbum">Name Album: </label>
            <input class="form-control" id="nameAlbum" name="nameAlbum" type="text" required/>
        </div>
        <div class="form-group">
            <label for="song">Song: </label>
            <input class="form-control" id="song" name="song" type="text" required/>
        </div>
        <div class="form-group">
            <label for="price">Price: </label>
            <input class="form-control" id="price" name="price" type="number" min="1" max="1000"
                   required/>
        </div>
        <div class="form-group">
            <label for="armyId">Army id: </label>
            <select class="form-control" id="armyId" name="armyId" required>
                <% for (Long armyId : armyIds) {%>
                <option value="<%= armyId %>"><%= armyId %>
                </option>
                <%}%>
            </select>
        </div>
        <br>
        <input type="submit" value="Create" class="btn btn-primary"/>
    </form>
</div>
</body>
</html>
