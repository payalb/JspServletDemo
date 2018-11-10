package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamDemo
 */
@WebServlet(urlPatterns = { "/InitParamDemo" }, initParams = { @WebInitParam(name = "p1", value = "Hello"),
		@WebInitParam(name = "p2", value = "Hi") })
public class InitParamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitParamDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		//;// .append("Served at: ").append(request.getContextPath());
		Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
		while (initParameterNames.hasMoreElements()) {
			String nextElement = initParameterNames.nextElement();
			String initParameter = getServletConfig().getInitParameter(nextElement);
			System.out.println(initParameter);

		}
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
