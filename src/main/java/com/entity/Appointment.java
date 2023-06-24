package com.entity;

public class Appointment {
	private int id ;
	private int userId;
	private String fullName;
	private String gender;
	private String age;
	private String appoinDate;
	private String email;
	private String phoneNo;
	private String diseases;
	private int docId;
	private String address;
	private String stutas;
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Appointment(int userId, String fullName, String gender, String age, String appoinDate, String email,
			String phoneNo, String diseases, int docId, String address, String stutas) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appoinDate = appoinDate;
		this.email = email;
		this.phoneNo = phoneNo;
		this.diseases = diseases;
		this.docId = docId;
		this.address = address;
		this.stutas = stutas;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getAppoinDate() {
		return appoinDate;
	}


	public void setAppoinDate(String appoinDate) {
		this.appoinDate = appoinDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getDiseases() {
		return diseases;
	}


	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}


	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStutas() {
		return stutas;
	}


	public void setStutas(String stutas) {
		this.stutas = stutas;
	}
	
	
	

}
