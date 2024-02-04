<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>welcome msg</h1>
	<form action="bookServlet" method="post">
		BookId : <input type="number" name="bookId" /> <br />
		 BookName : <input type="text" name="bookName" /> <br /> 
			BookPrice : <input type="text" name="bookPrice" /> <br />
			 <input type="submit" value="Submit" />



	</form>
</body>
</html>