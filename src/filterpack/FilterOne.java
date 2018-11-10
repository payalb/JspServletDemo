package filterpack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterOne
 */
@WebFilter( urlPatterns= {"/Servlet123","/Some"} ) // Not connected to the servlet
public class FilterOne implements Filter {

	/**
	 * Default constructor.
	 */
	public FilterOne() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		// ------------------Before Servlet --------
		// pass the request along the filter chain

		System.out.println("Filter Called Before");

		String parameter = request.getParameter("p1"); // we are storing in Filter Request 

		String upperCase = parameter.toUpperCase();
		System.out.println(upperCase);
		// response.s // catches request even before the servlet
		
		// here request data can be modified OR new data can be added 
		
		// ------------------Before Servlet --------
		
		request.setAttribute("cname", "AMAT"); // cname data is created by filter  
		
		chain.doFilter(request, response);// Last communication with client is done using response
		// ------------------After Servlet --------
		System.out.println("Filter called After");
		
		
		// while replying to client
		// ------------------After  Servlet --------

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
