

<!DOCTYPE html>
<html>
<head>
	<title>Secret</title>
	<meta name = "viewport" content = "width=device-width,initial-scale=1.0">
</head>

<body>
	
	<h2>
		<%
			String secret = request.getAttribute("styles");
			
			out.println(secret);
			
		%>
	</h2>
	
</body>
</html>