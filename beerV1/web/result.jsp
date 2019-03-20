<%@ page import = "java.util.*" %>

<html>
<head>
	<title>Result</title>
</head>

<body>
	<h1 align = "center">Beer Recommendations JSP</h1>
	
	<p>
	
	<%
		List styles = (List) request.getAttributes("styles");
		Iterator it = styles.iterator();
		while(it.hasNext()){
			out.println("<br>try : " + it.next());
		}
	%>
	</p>
</body>
</html>