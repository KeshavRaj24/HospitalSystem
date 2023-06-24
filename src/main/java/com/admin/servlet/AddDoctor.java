package com.admin.servlet;

import java.io.IOException;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName=req.getParameter("fullname");
			String dob=req.getParameter("dob");
			String qualification=req.getParameter("qualification");
			
			String specialist=req.getParameter("spec");
			
			String email=req.getParameter("email");
			String mobileNo=req.getParameter("mobno");
			String password=req.getParameter("password");
			
			Doctor d=new Doctor(fullName,dob,qualification,specialist,email,mobileNo,password);
			
			DoctorDao dao=new DoctorDao(DBConnect.getConn());
			HttpSession session=req.getSession();
			
			if(dao.registerDoctor(d))
			{
				session.setAttribute("succMsg", "Doctor Added Sucessfully..");
				resp.sendRedirect("admin/doctor.jsp");
			}else {
				session.setAttribute("errorMsg", "Something wrong on server..");
				resp.sendRedirect("admin/doctor.jsp");
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
