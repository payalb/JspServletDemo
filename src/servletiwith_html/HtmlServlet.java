package servletiwith_html;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlServlet
 */
@WebServlet("/HtmlServlet")
public class HtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String str = "hello";
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HtmlServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();// .append("Served at: ").append(request.getContextPath());
		writer.print("<html>");
		writer.print("<body>");

		writer.print("<form action='/RJTWebPro1/MyFirstServlet' method='post'>");
		writer.print("<input type='submit'>");
		writer.print("</form>");

		writer.print("</body>");
		writer.print("</html>");
		method1();
	}
	
	void method1() {
		
		System.out.println("IN  method1 ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
