<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">

		<div class="card ">

			<div class="card-body">

				<h1 class="text-center">Registration</h1>
				
				<div class="alert alert-danger" role="alert">
  				<form:errors path="studnet.*"></form:errors>
				</div>

				<form action="formHandler" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							name="email" type="email" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter email"> <small id="emailHelp"
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Id</label> <input name="id"
							type="text" name="id" class="form-control"
							id="exampleInputPassword1" placeholder="Enter Your Id">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Date Of Birth</label> <input
							name="dob" type="text" class="form-control"
							id="exampleInputPassword1" placeholder="dd/MM/yy">
					</div>

					<div class="form-group">
						<label for="couses">select courses</label> <select id="couses"
							class="form-control form-control-lg" name="courses" multiple>
							<option>java</option>
							<option>paython</option>
							<option>c++</option>
						</select>
					</div>

					<div class="form-group">

						<div class="custom-control custom-radio">
							<input value="male" type="radio" id="customRadio1" name="gender"
								class="custom-control-input"> <label
								class="custom-control-label" for="customRadio1">Male</label>
						</div>
						<div class="custom-control custom-radio">
							<input value="female" type="radio" id="customRadio2"
								name="gender" class="custom-control-input"> <label
								class="custom-control-label" for="customRadio2">Female</label>
						</div>


					</div>


					<div class="form-group">
						<label for="studenttype">select Type Student</label> <select
							id="studenttype" class="form-control form-control-lg" name="type">
							<option>old studnet</option>
							<option>new student</option>
						</select>
					</div>
					
					<div class="card">
					
					<p>Your Address</p>
					
					<div class="card-body">
					
					<div class="form-group">
					<input name="address.street" type='text' class="form-control form-control-lg" placeholder="street">
					
					</div>
					
					<div class="form-group">
					<input name="address.city" type='text' class="form-control form-control-lg" placeholder="city">
					
					</div>
					
					
					</div>
					
					</div>
			

			<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
	</div>

</body>
</html>