<%@ page import="org.example.labwork1final.model.Army" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update army</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<% Army army = (Army) request.getAttribute("army"); %>
<div class="container w-50">
    <form method="post" action="${pageContext.request.contextPath}/update-army">
        <h1>Update army</h1>
        <input type="hidden" name="armyId" value="<%= army.getId() %>">
        <div class="form-group">
            <label for="name">First name: </label>
            <input class="form-control" id="name" name="nameArmy" type="text" value="<%= army.getNameArmy() %>"
                   required/>
        </div>
        <br>
        <input type="submit" value="Update" class="btn btn-primary"/>
    </form>
</div>
</body>
</html>
