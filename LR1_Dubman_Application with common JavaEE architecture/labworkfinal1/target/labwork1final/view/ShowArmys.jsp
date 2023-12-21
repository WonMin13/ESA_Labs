<%@ page import="java.util.List" %>
<%@ page import="org.example.labwork1final.model.Army" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Armys</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
<% List<Army> armys = (List<Army>) request.getAttribute("armys"); %>
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
        <caption style="caption-side: top">Armys</caption>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <% for (Army army : armys) { %>
        <tr>
            <td><%= army.getId() %>
            </td>
            <td><%= army.getNameArmy() %>
            <td>
                <form action="${pageContext.request.contextPath}/update-army">
                    <input type="hidden" name="armyId" value="<%= army.getId() %>">
                    <input type="submit" class="btn btn-primary" value="Update">
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/delete-army" method="post">
                    <input type="hidden" name="armyId" value="<%= army.getId() %>">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </form>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <form action="${pageContext.request.contextPath}/create-army" method="get">
        <button class="btn btn-primary">Create army</button>
    </form>
</div>
</body>
</html>
