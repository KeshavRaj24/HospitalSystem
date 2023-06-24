<%@page import="com.entity.Doctor"%>
<%@page import="com.dao.DoctorDao"%>
<%@page import="com.entity.Appointment"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.AppointmentDao"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
<%@include file="../component/allcss.jsp"%>
<style type="text/css">
.card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3)
}
</style>
</head>
<body>
<c:if test="${empty doctorObj}">
		<c:redirect url="../doctor_login"></c:redirect>
	</c:if>
<%@include file="navbar.jsp"%>



<div class="container p-3 ">
		<div class="row">
			<div class="col-md-12 ms-auto">
				<div class="card paint-card ">
					<div class="card-body ">
						<p class="fs-4 fw-bold text-center text-success">Patient
							Details</p>
							<c:if test="${not empty errorMsg}">
							<p class="fs-3 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty succMsg}">
							<div class="fs-3 text-center text-success" role="alert">${succMsg}</div>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">Full Name</th>
									<th scope="col">Gender</th>
									<th scope="col">Age</th>
									<th scope="col">Appoint Date</th>
									<th scope="col">Email</th>
									<th scope="col">PhoneNo</th>
									<th scope="col">Disease</th>
									<th scope="col">Stutas</th>
									<th scope="col">Action</th>

								</tr>
							</thead>
							<tbody>
								<%
								Doctor doctor=(Doctor)session.getAttribute("doctorObj");
								AppointmentDao dao=new AppointmentDao(DBConnect.getConn());
								DoctorDao dao2=new DoctorDao(DBConnect.getConn());
								List<Appointment>list=dao.getAllAppointmentByDoctorLogin(doctor.getId());
								for(Appointment app:list){
								Doctor d=dao2.getAllDoctorById(app.getDocId());
								
								%>
									<tr>
									<th><%=app.getFullName()%></th>
									<td><%=app.getGender()%> </td>
									<td><%=app.getAge()%></td>
									<td><%=app.getAppoinDate() %></td>
									<td><%=app.getEmail() %></td>
									<td><%=app.getPhoneNo() %></td>
									<td><%=app.getDiseases() %></td>
									<td><%=app.getStutas() %></td>
									<td><%if("pending".equals(app.getStutas()))
									{
									%>
									<a href="comment.jsp?id=<%=app.getId() %>" class="btn btn-sm btn-success">Comment</a>
										
									<%}else
									{%>
										<a href="#" class="btn btn-success btn-sm disabled">Comment</a>
									<%}
									%></td>
									
									</tr>
								<%}
								%>



							</tbody>
						</table>

					</div>
				</div>
			</div>

			
		</div>
	</div>

</body>
</html>