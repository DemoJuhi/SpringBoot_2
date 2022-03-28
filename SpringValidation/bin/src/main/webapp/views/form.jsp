<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

			<div class="container">
				<div class="row mt-5">
					<div class="col-md-6 offset-md-3"></div>
					
					<sf:form action="/process" method="post" modelAttribute="loginData" >
					<h1 class="text-center">Register here</h1>
					
  						<div class="mb-3">
					    <label for="exampleInputEmail1" class="form-label">UserName</label>
					    
					    <input 
					    type="text"
					    name="userName" 
					    value="${loginData.userName}"
					    class="form-control"
					     id="exampleInputEmail1" 
					     aria-describedby="emailHelp">
					  </div>
					  
					
					  
					  
					  
					  <div class="mb-3">
					    <label for="exampleInputPassword1" class="form-label">Email</label>
					    
					    <input
					     type="email" 
					     name="email"
					     value="${loginData.email}"
					    class="form-control" 
					    id="exampleInputPassword1">
					  </div>
					  
					  
					  <div class="mb-3 form-check">
					    <input type="checkbox" class="form-check-input" id="exampleCheck1">
					    <label class="form-check-label" for="exampleCheck1">Check me out</label>
					  </div>
					  
					  
					  <button type="submit" class="btn btn-primary">Submit</button>
					</sf:form>
										
										
									</div>
								</div>

</body>
</html>