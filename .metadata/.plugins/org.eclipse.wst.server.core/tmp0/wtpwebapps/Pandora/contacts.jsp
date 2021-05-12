<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Contacts</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/contacts.css">
</head>
<body>
	<div id="main_menu">
		<div class="inner_main_menu">
			<ul>
				<li class="nav_item"><a href="catalog.jsp" class="nav_item">Catalog</a></li>
				<li class="nav_item"><a href="contacts.jsp" class="nav_item">Contacts</a></li>
				<li class="nav_item"><a href="about.jsp" class="nav_item">About me</a></li>
				<li class="nav_item"><a href="login.jsp" class="nav_item">Log out</a></li>
			</ul>
		</div>
	</div>
	<section>
		<div class="container">
			<form action="https://formspree.io/f/xeqvowly" method="post" is="my-form">
			
			<div class="form-group">
			<label for="firstName">First Name</label>
			<input type="text" id="firstName" name="firstName">
			</div>
			
			<div class="form-group">
			<label for="lastName">Last Name</label>
			<input type="text" id="lasttName" name="lasttName">
			</div>
			
			<div class="form-group">
			<label for="email">Email</label>
			<input type="email" id="email" name="email">
			</div>
			
			<div class="form-group">
			<label class="label-message" for="message">Message</label>
			<textarea name="message" id="message" cols="39" rows="12"></textarea>
			</div>
			<button type="submit">Submit</button>
			</form>
		</div>
	</section>	
</body>
</html>

