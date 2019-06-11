<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  
<title>Login</title>
</head>

<style>

* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
  background:none  ;
}

.login-page {
  width:1200px;
  padding: 20px 140px 0;
  margin:80px;
}
.form {
  
  background: #FFFFFF;
  max-width: 500px;
  margin: 0 auto 30px;
  padding: 65px;
  text-align: center;
  box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  }

.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background:#2F0C3D;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background:  #ddd;
color: black;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
</style>

</head>


<body >

<div class="login-page" >
  <div class="form">
    
    <form  action="Login" method="post">
<h1>Login</h1>
      <input type="text" name="username" placeholder="username" required/>
      <input type="password" name="password" placeholder="password" required/>
      <button>login</button>
      <p class="message">Not registered? <a href="Register.jsp">create account  </a></p>
 <p class="message"><a href="#">Forgot password?</a></p>
    </form>
  </div>
</div>

</body>
</html>