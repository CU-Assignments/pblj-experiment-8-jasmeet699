import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input values from HTML form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy validation (Replace with DB check in real apps)
        if ("user".equals(username) && "pass123".equals(password)) {
            out.println("<html><body style='background-color:#222; color:lime; text-align:center;'>");
            out.println("<h1>Login Successful</h1>");
            out.println("<h2>Welcome, " + username + " 🎉</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body style='background-color:#222; color:red; text-align:center;'>");
            out.println("<h1>Login Failed</h1>");
            out.println("<p>Invalid username or password. Please try again.</p>");
            out.println("</body></html>");
        }

        out.close();
    }
}
