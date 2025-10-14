<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Banking Application Template</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f8f9fa;
}

.hero {
	background: linear-gradient(to right, #0077b6, #00b4d8);
	color: white;
	padding: 100px 20px;
	text-align: center;
}

.card {
	transition: transform 0.3s ease;
}

.card:hover {
	transform: translateY(-5px);
}

footer {
	background: #212529;
	color: white;
	padding: 15px 0;
	text-align: center;
	margin-top: 40px;
}

.form-control:focus {
	border-color: #0077b6;
	box-shadow: 0 0 5px rgba(0, 119, 182, 0.5);
}

.auth-card {
	background: #fff;
	border-radius: 12px;
	padding: 30px;
	box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.1);
}

.auth-title {
	font-weight: bold;
	color: #0077b6;
	margin-bottom: 20px;
	text-align: center;
}
</style>

</head>

<body>



	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<div class="container">

			<a class="navbar-brand" href="#">🏦 MyBank</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav">

				<span class="navbar-toggler-icon"></span>

			</button>

			<div class="collapse navbar-collapse" id="navbarNav">

				<ul class="navbar-nav ms-auto">

					<li class="nav-item"><a class="nav-link active" href="#">Home</a></li>

					<li class="nav-item"><a class="nav-link" href="#services">Services</a></li>

					<li class="nav-item"><a class="nav-link" href="#dashboard">Dashboard</a></li>

					<li class="nav-item"><a class="nav-link" href="#register">Register</a></li>

					<li class="nav-item"><a class="nav-link" href="#login">Login</a></li>

				</ul>

			</div>

		</div>

	</nav>



	<section class="hero">

		<h1>Welcome to MyBank</h1>

		<p>Your trusted partner for secure banking</p>

		<a href="#services" class="btn btn-light btn-lg mt-3">Explore
			Services</a>

	</section>



	<section class="container my-5" id="services">

		<h2 class="text-center mb-4">Our Services</h2>

		<div class="row g-4">

			<div class="col-md-4">

				<div class="card shadow text-center p-3">

					<h5>💰 Deposit</h5>

					<p>Secure and instant deposits to your account.</p>

				</div>

			</div>

			<div class="col-md-4">

				<div class="card shadow text-center p-3">

					<h5>🏧 Withdraw</h5>

					<p>Quick withdrawals from any branch or ATM.</p>

				</div>

			</div>

			<div class="col-md-4">

				<div class="card shadow text-center p-3">

					<h5>🔄 Transfer</h5>

					<p>Transfer money safely to any account worldwide.</p>

				</div>

			</div>

		</div>

	</section>



	<section class="container my-5" id="dashboard">

		<h2 class="text-center mb-4">User Dashboard</h2>

		<div class="row">

			<div class="col-md-4">

				<div class="card shadow p-3">

					<h5>Account Summary</h5>

					<ul class="list-group">

						<li class="list-group-item">Account Holder: RAVI JOSHI</li>

						<li class="list-group-item">Account Number: 123456987</li>

						<li class="list-group-item">Balance: ₹50000000.00</li>

					</ul>

				</div>

			</div>

			<div class="col-md-8">

				<div class="card shadow p-3">

					<h5>Transaction History</h5>

					<table class="table table-striped">

						<thead>

							<tr>
								<th>Date</th>
								<th>Type</th>
								<th>Amount</th>
								<th>Balance</th>
							</tr>

						</thead>

						<tbody>

							<tr>
								<td>2025-09-15</td>
								<td>Deposit</td>
								<td>₹1000</td>
								<td>₹5000</td>
							</tr>

							<tr>
								<td>2025-09-10</td>
								<td>Withdraw</td>
								<td>₹500</td>
								<td>₹4000</td>
							</tr>

							<tr>
								<td>2025-09-01</td>
								<td>Transfer</td>
								<td>₹200</td>
								<td>₹4500</td>
							</tr>

						</tbody>

					</table>

				</div>

			</div>

		</div>

	</section>



	<section class="container my-5" id="register">

		<div class="row justify-content-center">

			<div class="col-md-6">

				<div class="auth-card">

					<h2 class="auth-title">Create an Account</h2>

                    <form action="InsertPage" method="post" enctype="multipart/form-data"> 

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-user"></i></span>

							<input type="text" class="form-control" placeholder="Full Name"
								required name="Username">

						</div>

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-envelope"></i></span>

							<input type="email" class="form-control" placeholder="Email"
								required name="Email">

						</div>

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-phone"></i></span>

							<input type="text" class="form-control"
								placeholder="Phone Number" required name="Phone">

						</div>

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-lock"></i></span>

							<input type="password" class="form-control"
								placeholder="Password" required name="Password">

						</div>

                        <div class="mb-3 input-group">
                            <span class="input-group-text"><i class="fa fa-camera"></i></span>
                            <input type="file" class="form-control" placeholder="Profile Photo"
                                required name="photo"> 
                        </div>


						<input type="submit" class="btn btn-primary w-100"
							value="Register">

						<p class="text-center mt-3">
							Already have an account? <a href="#login">Login here</a>
						</p>
						<%
						String s = (String) request.getAttribute("msg");
						if (s != null) {
							out.println("<h6 class='text-success'>" + s + "</h6>");
						}
						%>

					</form>

				</div>

			</div>

		</div>

	</section>



	<section class="container my-5" id="login">

		<div class="row justify-content-center">

			<div class="col-md-6">

				<div class="auth-card">

					<h2 class="auth-title">Login to Your Account</h2>

                    <form action="Login" method="post"> 

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-envelope"></i></span>

							<input type="email" class="form-control" placeholder="Email"
								required name="Email" > 

						</div>

						<div class="mb-3 input-group">

							<span class="input-group-text"><i class="fa fa-lock"></i></span>

                            <input type="password" class="form-control"
								placeholder="Password" required name="Password"> 
								
						</div>
                        
                        <button type="submit" class="btn btn-success w-100">Login</button>

						<p class="text-center mt-3">
							Don’t have an account? <a href="#register">Register here</a>
						</p>
                        
                        <% 
                        // Display error message from LoginServlet on failure
                        String loginMsg = (String) request.getAttribute("msg");
                        if (loginMsg != null && loginMsg.contains("Invalid")) {
                            out.println("<p class='text-danger'>" + loginMsg + "</p>");
                        }
                        %>

					</form>

				</div>

			</div>

		</div>

	</section>



	<footer>

		<p>&copy; 2025 MyBank. All Rights Reserved.</p>

	</footer>



	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>