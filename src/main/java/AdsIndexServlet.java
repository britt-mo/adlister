import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by brittmo on 12/14/16.
 */
@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get list of ads from ListAdsDAO
        Ads AdsDao = DaoFactory.getAdsDao();
        //make a variable that holds the result of calling all() method on ListAdsDAO
        List<Ad> ads = AdsDao.all();
        //send that data into the view
        //set parameter on the response

        //in the view, iterate across the list and output the ads
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }
}
