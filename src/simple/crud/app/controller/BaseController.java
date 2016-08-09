package simple.crud.app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simple.crud.app.service.LinkMap;
import simple.crud.app.service.HelperService;

/**
 * Servlet implementation class BaseController
 */
/*@WebServlet(
		description = "This is Base Controller Servlet", 
		urlPatterns = { "/BaseController" }, 
		initParams = { 
				@WebInitParam(name = "my-init-pr-1", value = "Job Portal", description = "Application Name")
		})*/
public class BaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BaseController() {
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
		/*leftLinks.put("Add User", new LinkMap("Add User", userBaseUrl+"?action=add-user", ""));
		leftLinks.put("Update User", new LinkMap("Update User", userBaseUrl+"?action=update-user", ""));
		leftLinks.put("Delete User", new LinkMap("Delete User", userBaseUrl+"?action=delete-user", ""));*/
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
	 * @see Servlet#getServletConfig()
	 */
	/*public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}*/

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String base = "/jsp/";
		String url = base + "index.jsp";
		String action = request.getParameter("action");
		
		if (action != null) {
			switch (action) {
				case "add-user":
					url = base + "index.jsp";
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

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	/*protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}*/

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	/*protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}*/

}
