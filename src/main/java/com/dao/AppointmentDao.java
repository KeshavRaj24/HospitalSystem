package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import com.entity.Appointment;

public class AppointmentDao {
	private Connection conn;

	
	public AppointmentDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addAppointment(Appointment app)
	{
		boolean f=false;
		try {
			String sql="insert into appointment(user_id,fullName,gender,age,appoint_date,email,phoneNo,diseases,doc_id,address,stutas)values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, app.getUserId());
			ps.setString(2, app.getFullName());
			ps.setString(3, app.getGender());
			ps.setString(4, app.getAge());
			ps.setString(5, app.getAppoinDate());
			ps.setString(6, app.getEmail());
			ps.setString(7, app.getPhoneNo());
			ps.setString(8, app.getDiseases());
			ps.setInt(9, app.getDocId());
			ps.setString(10, app.getAddress());
			ps.setString(11, app.getStutas());
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	public List<Appointment> getAllAppointmentByLoginUser(int userId)
	{
		List<Appointment>list=new ArrayList<Appointment>();
		Appointment app=null;
		try {
			String sql="select*from appointment where user_id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				app=new Appointment();
				app.setId(rs.getInt(1));
				app.setUserId(rs.getInt(2));
				app.setFullName(rs.getString(3));
				app.setGender(rs.getString(4));
				app.setAge(rs.getString(5));
				app.setAppoinDate(rs.getString(6));
				app.setEmail(rs.getString(7));
				app.setPhoneNo(rs.getString(8));
				app.setDiseases(rs.getString(9));
				app.setDocId(rs.getInt(10));
				app.setAddress(rs.getString(11));
				app.setStutas(rs.getString(12));
				list.add(app);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public List<Appointment> getAllAppointmentByDoctorLogin(int doctorId)
	{
		List<Appointment>list=new ArrayList<Appointment>();
		Appointment app=null;
		try {
			String sql="select*from appointment where doc_id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, doctorId);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				app=new Appointment();
				app.setId(rs.getInt(1));
				app.setUserId(rs.getInt(2));
				app.setFullName(rs.getString(3));
				app.setGender(rs.getString(4));
				app.setAge(rs.getString(5));
				app.setAppoinDate(rs.getString(6));
				app.setEmail(rs.getString(7));
				app.setPhoneNo(rs.getString(8));
				app.setDiseases(rs.getString(9));
				app.setDocId(rs.getInt(10));
				app.setAddress(rs.getString(11));
				app.setStutas(rs.getString(12));
				list.add(app);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Appointment getAllAppointmentById(int id)
	{
		
		Appointment app=null;
		try {
			String sql="select*from appointment where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				app=new Appointment();
				app.setId(rs.getInt(1));
				app.setUserId(rs.getInt(2));
				app.setFullName(rs.getString(3));
				app.setGender(rs.getString(4));
				app.setAge(rs.getString(5));
				app.setAppoinDate(rs.getString(6));
				app.setEmail(rs.getString(7));
				app.setPhoneNo(rs.getString(8));
				app.setDiseases(rs.getString(9));
				app.setDocId(rs.getInt(10));
				app.setAddress(rs.getString(11));
				app.setStutas(rs.getString(12));
			
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return app;
	}

public boolean updateCommentStutas(int id,int docId,String comm)
{
	boolean f=false;
	try {
		String sql="update appointment set stutas=? where id=? and doc_id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, comm);
		ps.setInt(2, id);
		ps.setInt(3, docId);
     int i=ps.executeUpdate();
     if(i==1)
     {
    	 f=true;
     }
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return f;
}


}
