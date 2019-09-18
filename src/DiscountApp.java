import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "DiscountApp" , urlPatterns = "/result")
public class DiscountApp extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float  price   = Float.parseFloat(request.getParameter("price"));
        float  discount= Float.parseFloat(request.getParameter("discount"));
  //      Discount Amount = List Price * Discount Percent * 0.1
        float  amountDiscount  = (float) (price/100)*discount;
        float  moneyAfterDiscount = price - amountDiscount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<center><h2>Product Discount Calculator</h2>");
        writer.println("<center><h4><label>Product Description: " + product +" </label></h4>");
        writer.println("<center><h4><label>Price: "+price+" $"+"</label></h4></center>");
        writer.println("<center><h4><label>Discount Percent: "+discount+" %"+"</label></h4>");
        writer.println("<center><h4><label>Discount Amount: "+amountDiscount+" $"+" </label></h4>");
        writer.println("<center><h4><label>Discount Price: "+moneyAfterDiscount+" $"+" </label></h4></center>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String product = request.getParameter("product");
        float  price   = Float.parseFloat(request.getParameter("price"));
        float  discount= Float.parseFloat(request.getParameter("discount"));
        //      Discount Amount = List Price * Discount Percent * 0.1
        float  amountDiscount  = (float) (price/100)*discount;
        float  moneyAfterDiscount = price - amountDiscount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<center><h2>Product Discount Calculator</h2>");
        writer.println("<center><h4><label>Product Description: " + product +" </label></h4>");
        writer.println("<center><h4><label>Price: "+price+" $"+"</label></h4></center>");
        writer.println("<center><h4><label>Discount Percent: "+discount+" %"+"</label></h4>");
        writer.println("<center><h4><label>Discount Amount: "+amountDiscount+" $"+" </label></h4>");
        writer.println("<center><h4><label>Discount Price: "+moneyAfterDiscount+" $"+" </label></h4></center>");
        writer.println("</html>");
    }
}
