package com.comit.servlet;

import java.io.IOException;
//import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello");
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		// ServletContext sc = getServletContext();
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		session.setAttribute("email", email);
		// String email1=sc.getInitParameter("email");
		// sc.setAttribute("email",email);

		String password = request.getParameter("password");
		// HttpSession session=request.getSession();

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginDB", "root", "");
			PreparedStatement pst = conn
					.prepareStatement("Select email,password from login where email=? and password=?");

			pst.setString(1, email);
			pst.setString(2, password);
			// System.out.println("querry="+pst.ge)

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				System.out.println(rs.getString(1));
				System.out.println("Welcome");
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);
				//response.sendRedirect("home.jsp");

			} else {
				System.out.println("Username or Password incorrect");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}