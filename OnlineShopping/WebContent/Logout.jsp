<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 
</head>
<body>
<script type="text/javascript">
function preventBack() 
{
window.history.forward();

}
setTimeout("preventBack()", 0);
window.onunload = function () { null };
alert("Unable to connnect Please Login again")
</script>
<h1> Successfully logged out!!!!</h1>
<form action="Login.jsp"> <button>login here</button>  </form>
       
</body>
</html>