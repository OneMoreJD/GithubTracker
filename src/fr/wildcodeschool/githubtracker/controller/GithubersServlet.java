package fr.wildcodeschool.githubtracker.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.wildcodeschool.githubtracker.model.Githuber;

/**
 * Servlet implementation class GithubersServlet
 */
@WebServlet("/githubers")
public class GithubersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GithubersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Githuber[] githubers = new Githuber[5];
		
		githubers[0] = new Githuber("Jerome", "jd@natixis.com", "jhd", 1, "jhdavatar");
		githubers[1] = new Githuber("Michel", "mf@natixis.com", "mf4", 2, "mf4avatar");
		githubers[2] = new Githuber("Eric", "el@natixis.com", "el9", 3, "el9avatar");
		githubers[3] = new Githuber("Fernand", "fp@natixis.com", "fp2", 4, "fp2avatar");
		githubers[4] = new Githuber("Vincent", "ve@natixis.com", "ve3", 5, "ve3avatar");
		
		request.setAttribute("githubers", githubers);
		request.getRequestDispatcher("githubers.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
