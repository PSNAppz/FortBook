<%-- 
    Document   : register
    Created on : 14 Mar, 2018, 1:48:39 PM
    Author     : p2mca17033
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="Favicon.ico?" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mario - Register</title>
          <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <style>
body{
    background:#efefef;
}
.form-body{
    background:#fff;
    padding:20px;
}
.login-form{
    background:rgba(255,255,255,0.8);
	padding:20px;
	border-top:3px solid#3e4043;
}
.innter-form{
	padding-top:20px;
}
.final-login li{
	width:50%;
}

.nav-tabs {
    border-bottom: none !important;
}

.nav-tabs>li{
	color:#222 !important;
}
.nav-tabs>li.active>a, .nav-tabs>li.active>a:hover, .nav-tabs>li.active>a:focus {
    color: #fff;
    background-color: #d14d42;
    border: none !important;
    border-bottom-color: transparent;
	border-radius:none !important;
}
.nav-tabs>li>a {
    margin-right: 2px;
    line-height: 1.428571429;
    border: none !important;
    border-radius:none !important;
	text-transform:uppercase;
	font-size:16px;
}

.social-login{
	text-align:center;
	font-size:12px;
}
.social-login p{
	margin:15px 0;
}
.social-login ul{
	margin:0;
	padding:0;
	list-style-type:none;
}
.social-login ul li{
	width:33%;
	float:left;
    clear:fix;
}
.social-login ul li a{
	font-size:13px;
	color:#fff;
	text-decoration:none;
	padding:10px 0;
	display:block;
}
.social-login ul li:nth-child(1) a{
	background:#3b5998;
}
.social-login ul li:nth-child(2) a{
	background:#e74c3d;
}
.social-login ul li:nth-child(3) a{
	background:#3698d9;
}
.sa-innate-form input[type=text], input[type=password], input[type=file], textarea, select, email{
    font-size:13px;
	padding:10px;
	border:1px solid#ccc;
	outline:none;
	width:100%;
	margin:8px 0;
	
}
.sa-innate-form input[type=submit]{
    border:1px solid#e64b3b;
	background:#e64b3b;
	color:#fff;
	padding:10px 25px;
	font-size:14px;
	margin-top:5px;
	}
	.sa-innate-form input[type=submit]:hover{
	border:1px solid#db3b2b;
	background:#db3b2b;
	color:#fff;
	}
	
	.sa-innate-form button{
	border:1px solid#e64b3b;
	background:#e64b3b;
	color:#fff;
	padding:10px 25px;
	font-size:14px;
	margin-top:5px;
	}
	.sa-innate-form button:hover{
	border:1px solid#db3b2b;
	background:#db3b2b;
	color:#fff;
	}
    .sa-innate-form p{
        font-size:13px;
        padding-top:10px;
    }
        </style>
    </head>
    <body>
        <%
             if (session.getAttribute("loggedInUser") != null) {
                response.sendRedirect("home.jsp");

            }
if (request.getParameter("Submit")!=null && request.getParameter("username") != null && request.getParameter("password") != null && request.getParameter("email") != null) {  
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
        Statement st = con.createStatement();
        Statement makeFriend = con.createStatement();
        Statement myDetails = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into users(username,email,password) values ('" + username + "','" + email + "','" +password + "')");
   
    if (i > 0) {
        ResultSet details = myDetails.executeQuery("select * from users where email='" + email + "'");
        if(details.next()){
            int id = details.getInt("userid");
            makeFriend.executeUpdate("insert into friends(userid,friendid)values("+ id +","+ id +")" );
        }
        request.getSession().setAttribute("loggedInUser", email);  
        response.sendRedirect("home.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else { %>
        
         <div class="container">
	<div class="row">
        <h2>Join FortBook Social Networking</h2>
	</div>
        </div>
       <% response.sendRedirect("index.jsp");
    }
}
%>
<br>
<br>
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="form-body">
    <ul class="nav nav-tabs final-login">
        <li ><a data-toggle="tab" href="index.jsp">Sign In</a></li>
        <li class="active"><a data-toggle="tab" href="#register">Join us!</a></li>
    </ul>
    <div class="tab-content">
        
        <div id="sectionB"  class="tab-pane fade in active">
			<div class="innter-form">
            <form class="sa-innate-form" method="post">
            <label>Name</label>
            <input type="text" name="username" required="true">
            <label>Email Address</label>
            <input type="text" name="email" required="true">
            <label>Password</label>
            <input type="password" name="password" required="true">
            <button type="submit" name="Submit">Join now</button>
            <p>By clicking Join now, you agree to User Agreement, Privacy Policy, and Cookie Policy.</p>
            </form>
            </div>
            
        </div>
    </div>
    </div>
    </div>
    </div>
    </div>
    </body>
</html>
