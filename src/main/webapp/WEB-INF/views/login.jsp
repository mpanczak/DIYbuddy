<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 21.06.2023
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login Panel</h2>
<div class="container w-25">
    <form action="/login" method="post">
        <h1>Logowanie</h1>
        <div>
            <input type="text" class="form-control" id="email" name="email" placeholder="podaj adres email">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" id="password" name="password" placeholder="podaj hasło">
        </div>
        <button class="btn btn-color rounded-0" type="submit">Zaloguj</button>
    </form>
</div>
</body>
</html>
