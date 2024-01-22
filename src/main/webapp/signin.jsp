<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/partials/head.jsp" %>
<body>
    <div class="row">
        <div class="col">
            <h1 class="text-center mt-3">Budget Ducklings Inc | Sign-in</h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <div class="text-center mt-3">
                <h2>Sign In or Create an Account</h2>
            </div>
            <div class="text-center mt-3">
                <!-- Add your sign-in or create account form here -->
                <form action="login" method="post">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" required>
                    <br>
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                    <br>
                    <button type="submit">Sign In</button>
                </form>
                <p class="mt-3">Don't have an account? <a href="./signup.jsp">Create a new account</a></p>
            </div>
        </div>
    </div>
</body>
</html>
