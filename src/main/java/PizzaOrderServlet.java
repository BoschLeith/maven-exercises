import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("pizzaOrder.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String crust = request.getParameter("crust");
		String sauce = request.getParameter("sauce");
		String size = request.getParameter("size");
		String[] toppings = request.getParameterValues("toppings");
		String address = request.getParameter("address");
		System.out.println(crust);
		System.out.println(sauce);
		System.out.println(size);
		for (String topping : toppings) {
			System.out.println(topping);
		}
		System.out.println(address);
		request.getRequestDispatcher("pizzaOrder.jsp").forward(request, response);
	}
}
