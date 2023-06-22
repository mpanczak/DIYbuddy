<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Register</title>
    <style><%@include file="/WEB-INF/assets/dist/css/bootstrap.min.css"%></style>
    <style><%@include file="/WEB-INF/assets/dist/css/sign-in.css"%></style>
</head>
<body>
<main class="form-signin w-100 m-auto">
    <form method="post" action="register">
        <%--        <img class="mb-4" src="../assets/brand/diybuddy.jpg" alt="" width="72" height="57">--%>
        <h1 class="h3 mb-3 fw-normal">Create account</h1>

        <div class="form-floating">
            <input type="email" name="email" class="form-control" id="floatingInput" placeholder="name@example.com">
            <label for="floatingInput">Email address</label>
        </div>
        <div class="form-floating">
            <input type="text" name="login" class="form-control" id="floatingInput1" placeholder="login">
            <label for="floatingInput">User name</label>
        </div>

        <div class="form-floating">
            <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
            <label for="floatingPassword">Password</label>
        </div>
        <div class="form-floating">
            <input type="password" name="repeatedPassword" class="form-control" id="floatingPassword1" placeholder="Password">
            <label for="floatingPassword">Repeat password</label>
        </div>

        <button class="btn btn-primary w-100 py-2" type="submit">Sign up</button>
        <p class="mt-5 mb-3 text-body-secondary">&copy; 2017–2023</p>
    </form>
</main>
</body>
</html>