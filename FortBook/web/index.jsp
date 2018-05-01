<%-- 
    Document   : Index
    Created on : 14 Mar, 2018, 1:40:49 PM
    Author     : p2mca17033
--%>

<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <link rel="shortcut icon" href="Favicon.ico?" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FortBook - Login</title>  
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <style>
        @font-face {
                font-family: LuckiestGuy;
                src: url(assets/fonts/lucky.ttf);}

            /* form */
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
    #logo{
        font-family: LuckiestGuy;
    }
        </style>
        
    </head>
    <body>
      <div class="container">
	<div class="row">
		<h2 id="logo">FortBook</h2>
	</div>
</div>
<br>
<br>
<div class="container">
<div class="row">
<div class="col-md-4 col-md-offset-4">
<div class="form-body">
    <ul class="nav nav-tabs final-login">
        <li class="active"><a data-toggle="tab" href="#login">Sign In</a></li>
        <li><a data-toggle="tab" href="register.jsp">Join us!</a></li>
    </ul>
    <div class="tab-content">
        <%
            if (session.getAttribute("loggedInUser") != null) {
                response.sendRedirect("home.jsp");

            }
if(request.getParameter("Submit") != null){
    String email = request.getParameter("email");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from users where email='" + email + "' and password='" + password + "'");
    if (rs.next()) {
    request.getSession().setAttribute("loggedInUser", email);  
    request.getSession().setAttribute("loggedInUserID", rs.getInt("userid"));  
    response.sendRedirect("home.jsp");
    }else{ %>
    <div id="sectionA" class="tab-pane fade in active">
        <div class="innter-form">
            <label class="label-danger">Wrong Email or Password !</label><br>
            <form class="sa-innate-form" method="post">
            <label>Email Address</label>
            <input type="text" name="email">
            <label>Password</label>
            <input type="password" name="password">
            <button type="submit" name="Submit">Sign In</button>
            <a href="">Forgot Password?</a>
            </form>
            </div>
            
            <div class="clearfix"></div>
        </div>
        
    <%} 
}else{
%>
    <div id="sectionA" class="tab-pane fade in active">
        <div class="innter-form">
            <form class="sa-innate-form" method="post">
            <label>Email Address</label>
            <input type="text" name="email">
            <label>Password</label>
            <input type="password" name="password">
            <button type="submit" name="Submit">Sign In</button>
            <a href="">Forgot Password?</a>
            </form>
            </div>
            
            <div class="clearfix"></div>
        </div>
        <%
}
%>
        
    </div>
    </div>
    </div>
    </div>
    </div>


    </body>
</html>
