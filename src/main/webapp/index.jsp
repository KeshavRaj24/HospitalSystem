
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style type="text/css">
.card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3)
}
</style>

<%@include file="component/allcss.jsp" %>
</head>
<body>
<%@include file="component/navbar.jsp" %>




<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="image/hos1.jpg" class="d-block w-100" alt="..."height="500px">
    </div>
    <div class="carousel-item">
      <img src="image/hos3.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
    <div class="carousel-item">
      <img src="image/hos5.jpg" class="d-block w-100" alt="..." height="500px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
<div class="container p-3">
<p class="text-center fs-2">Key Features of our Hospital</p>

<div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col">
    <div class="card">
      <img src="image/safety.jpg" class="card-img-top" alt="..." height="200px">
      <div class="card-body">
        <h5 class="card-title">100% Safety</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="image/clean.jpg" class="card-img-top" alt="..." height="200px">
      <div class="card-body">
        <h5 class="card-title">Clean Enviroment</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="image/doc_friendly.jpg" class="card-img-top" alt="..." height="200px">
      <div class="card-body">
        <h5 class="card">Friendly Doctor</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="image/lab.jpg" class="card-img-top" alt="..." height="200px">
      <div class="card-body">
        <h5 class="card-title">Medical Research</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
</div>

</div>
<div class="container p-3">
<p class="text-center fs-2">Our Team</p>

<div class="row row-cols-1 row-cols-md-3 g-4">
  <div class="col">
    <div class="card h-100">
      <img src="image/doc1.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Dr.Keshav Rajput</h5>
        <p class="card-text">(CEO&Chairman) </p>
      </div>
      
    </div>
  </div>
  <div class="col">
    <div class="card h-100">
      <img src="image/doc2.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Dr.Priya Sharma</h5>
        <p class="card-text">(Chief Doctor)</p>
      </div>
      
    </div>
  </div>
  <div class="col">
    <div class="card h-100">
      <img src="image/doc4.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Dr.Prayag Shankar</h5>
        <p class="card-text">(Chief Doctor)</p>
      </div>
     
    </div>
  </div>
</div>

</div>

<%@include file="component/footer.jsp" %>
</body>
</html>