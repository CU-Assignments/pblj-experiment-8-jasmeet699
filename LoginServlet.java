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

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy check (In real projects, use DB or authentication APIs)
        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<html><body style='background-color:#222; color:lime; text-align:center;'>");
            out.println("<h2>Login Successful!</h2>");
            out.println("<h3>Welcome, " + username + " 🎉</h3>");
            out.println("</body></html>");
        } else {
            out.println("<html><body style='background-color:#222; color:red; text-align:center;'>");
            out.println("<h2>Login Failed!</h2>");
            out.println("<p>Invalid username or password.</p>");
            out.println("</body></html>");
        }
        out.close();
    }
}
