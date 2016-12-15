import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

      int counter;

        if(session.getAttribute("counter") != null) {
           counter = (int) session.getAttribute("counter");
        }else {
            counter = 0;
        }
            counter++;

        session.setAttribute("counter", counter);

        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}
