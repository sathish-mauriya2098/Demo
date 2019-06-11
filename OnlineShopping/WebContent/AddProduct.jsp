<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body{

background-repeat:no-repeat;
backgrounnd-position:center;
backgroun-size:cover;
background-size: 1500px 700px;
}
b
{
font-size:20px;
color:orange;
}
h1
{
font-size:30px;
color:orange;
}

</style>
<body>
	
		<center>
		<h1>Enter details to add product </h1>
		</center>
		<hr>
		
		<br>
		<br>
		<br>
		<br>
		<form action="AddProduct" enctype='multipart/form-data' method="post">
			<table width="400px" align="center" border=2>
				<tr>
					<td align="center" colspan="2"><b>Update Item</b></td>
				</tr>
				<tr>
					<td><b>Product Name</b></td>
					<td><input type="text" name="produtcName" /></td>
				</tr>
				<tr>
					<td><b>Cost</b></td>
					<td><input type="number" name="cost" /></td>
				</tr>
				<tr>
					<td><b>Quantity</b></td>
					<td><input type="number" name="quantity" /></td>
				</tr>
				<tr>
					<td><b>Image</b></td>
					<td><input type="file" name="file"><br><br></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="submit" /></td>
				</tr>
			</table>

		</form>
</body>
</html>