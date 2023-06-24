package com.entity;

public class Doctor {
	private int id;
	private String FullName;
	private String dob;
	private String qualification;
	private String specialist;
	private String email;
	private String mobileNo;
	private String password;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Doctor(String fullName, String dob, String qualification, String specialist, String email, String mobileNo,
			String password) {
		super();
		FullName = fullName;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
	}
	
	



	public Doctor(int id, String fullName, String dob, String qualification, String specialist, String email,
			String mobileNo, String password) {
		super();
		this.id = id;
		FullName = fullName;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFullName() {
		return FullName;
	}



	public void setFullName(String fullName) {
		FullName = fullName;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getSpecialist() {
		return specialist;
	}



	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
