import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ProfileDataAccessObject profileDao = new ProfileDataAccessObject();
        boolean isAuthenticated = profileDao.authenticateUser(username, password);

        if (isAuthenticated) {
            // Redirect to the home page
            response.sendRedirect("/index");
        } else {
            // Redirect back to the login page with an error message
            response.sendRedirect("/login?error=1");
        }
    }
}
