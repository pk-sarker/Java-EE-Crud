package simple.crud.app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simple.crud.app.service.HelperService;
import simple.crud.app.service.LinkMap;

/**
 * Servlet implementation class UserController
 */

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		ServletContext application = config.getServletContext();
		Map<String, LinkMap> leftLinks = new HashMap<String, LinkMap>();
		String userBaseUrl = config.getInitParameter("userBase");
		HelperService helperObj = new HelperService();
		leftLinks = helperObj.getLeftLinks();
		
		application.setAttribute("leftLinks", leftLinks);
		application.setAttribute("appname", "JOB PORTAL APPLICATION");
		application.setAttribute("baseUrl",config.getInitParameter("base"));
		application.setAttribute("userBaseUrl", userBaseUrl);
		application.setAttribute("assets",config.getInitParameter("imageURL"));
		application.setAttribute("param1",config.getInitParameter("param1"));
		application.setAttribute("add_new_book",config.getInitParameter("add_new_book"));
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("User Servlet: Served at: ").append(request.getContextPath());
		String base = "/jsp/";
		String url = base + "user_home.jsp";
		String action = request.getParameter("action");
		
		if (action != null) {
			switch (action) {
				case "add-user":
					url = base + "user_add_form.jsp";
					break;
				/*case "category":
					url = base + "category.jsp?category=" + category;
					break;
				case "search":
					url = base + "searchResult.jsp";
					break;*/
			
			}
		}
		System.out.println(url);
		
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
