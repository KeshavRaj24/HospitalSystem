package com.user.servlet;
import com.db.DBConnect;
import com.entity.User;
import com.dao.UserDao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/user_register")
public class UserRegister extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String username=req.getParameter("username");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			User u=new User(username,email,password);
			 
			
			UserDao dao=new UserDao(DBConnect.getConn());
			
			HttpSession session=req.getSession();
			
			boolean f=dao.userRegister(u);
			
			
			if(f) {
				session.setAttribute("succMsg", "Register Sucessfully");
				resp.sendRedirect("signup.jsp");
				
			}else {
				session.setAttribute("errorMsg", "Somthing on server");
				resp.sendRedirect("signup.jsp");
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
