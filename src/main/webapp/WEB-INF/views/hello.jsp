<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"></link>
	
	<script src="<c:url value="/resources/js/script.js" />"></script>
	
    <title>Hello, world!</title>
  </head>
  <body>
    	<div class="container">
    	
    	<div class="card mx-auto mt-5 bg-secondary" style="width:50%;">
    		
    		<div class="card-body">
    		
    		<h3 class="text-center text-white">My Search</h3>
    		
    		<form action="search" class="mt-5" >
    		
    		
    		
    		<div class="form-group">
    			<input type="text" name="querybox" placeholder="enter your keyword" class="form-control">
    		</div>
    		
    		<div class="text-center">
    		
    		<button class="btn btn-outline-light mt-3">search</button>
    		
    		</div>
    		
    		</form>
    		
    		</div>
    	
    	</div>
</div>
    	
  </body>
</html>