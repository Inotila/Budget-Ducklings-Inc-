<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/partials/head.jsp" %>
<body>
    <div class="row">
        <div class="col">
            <h1 class="text-center mt-3">Budget Ducklings Inc| Sign-up</h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <div class="text-center mt-3">
                <h2>Create a New Account</h2>
            </div>
            <div class="text-center mt-3">
                <!-- Add your signup form here -->
                <form action="/Budget-Ducklings-Inc-/signup" method="post">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" required>
                    <br>
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" required>
                    <br>
                    <label for="surname">Surname:</label>
                    <input type="text" id="surname" name="surname" required>
                    <br>
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                    <br>
                    <label for="re-enter-password">Re-enter Password:</label>
                    <input type="password" id="re-enter-password" name="re-enter-password" required>
                    <br>
                    <button type="submit">Create Account</button>
                </form>
                <p class="mt-3">Already have an account? <a href="./signin.jsp">Sign In</a></p>
            </div>
        </div>
    </div>
</body>
</html>
