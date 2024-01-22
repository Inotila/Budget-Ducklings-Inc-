import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String password = request.getParameter("password");

        ProfileDataAccessObject profileDao = new ProfileDataAccessObject();

        // Create a new Profile object and set the values
        Profile newProfile = new Profile();
        newProfile.setUsername(username);
        newProfile.setName(name);
        newProfile.setSurname(surname);
        newProfile.setPassword(password);

        // Save the new profile to the database
        boolean isProfileCreated = profileDao.createProfile(newProfile);

        if (isProfileCreated) {
            // Redirect to the home page or perform other actions
            response.sendRedirect("/index");
        } else {
            // Redirect back to the signup page with an error message
            response.sendRedirect("/signup?error=1");
        }
    }
}
