import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productdescription");
        float listPrice = Float.parseFloat(request.getParameter("listprice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountpercent"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        try {

            float discountAmount = Calculator.caculate(listPrice, discountPercent);
            float discountPrice = listPrice - discountAmount;
            writer.println("Product Description: " + productDescription);
            writer.println("<br>");
            writer.println("Discount Amount: " + discountAmount);
            writer.println("<br>");
            writer.println("Discount Price: " + discountPrice);
        } catch (Exception ex) {
            writer.println("Error: " + ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
