<%@page import="com.entity.Appointment"%>
<%@page import="com.dao.AppointmentDao"%>
<%@page import="com.db.DBConnect" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comment</title>
<%@include file="../component/allcss.jsp"%>
<style type="text/css">
.card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3)
}
</style>
</head>
<body>
	<c:if test="${empty doctorObj}">
		<c:redirect url="../doctor_login"></c:redirect>
	</c:if>
	<%@include file="navbar.jsp"%>
	<div class="container-fuild p-5">
	<p class="text-center fs-2 text-white"></p>
	
	</div>
	<div class="container p-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card paint-card">
					<div class="card-body">
						<p class="text-center fs-4">Patient Comment</p>
						<% int id=Integer.parseInt(request.getParameter("id"));
						AppointmentDao dao=new AppointmentDao(DBConnect.getConn());
						Appointment app=dao.getAllAppointmentById(id);
						
						%>

						<form class="row" action="../updateStutas" method="post">
							<div class="col-md-6">
								<br><label>Patient Name</label><input type="text" readonly value="<%=app.getFullName() %>"
									class="form-control">
							</div>

							<div class="col-md-6">
								<br><label>Age</label><input type="text" readonly value="<%=app.getAge() %>"
									class="form-control">
							</div>
							<div class="col-md-6">
								<br><label>MobileNo</label><input type="text" readonly value="<%=app.getPhoneNo() %>"
									class="form-control">
							</div>

							<div class="col-md-6">
								<br><label>Diseases</label><input type="text" readonly value="<%=app.getDiseases()%>"
									class="form-control">
							</div>
							<div class="col-md-12">
								<br><label>Comment</label>
								<textarea required name="comm" class="form-control" rows="3"
									cols=""></textarea>
							</div>
							<input type="hidden" name="id" value="<%=app.getId()%>"> <input
								type="hidden" name="did" value="<%=app.getDocId()%>">

							<button class="mt-3 btn btn-primary col-md-6 offset-md-3">Submit</button>
						</form>

					</div>

				</div>
			</div>
		</div>


	</div>
</body>
</html>