<%-- 
    Document   : home
    Created on : 14 Apr, 2018, 9:08:25 AM
    Author     : psn
--%>
<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<%
if (session == null || session.getAttribute("loggedInUser") == null) {
    response.sendRedirect("index.jsp");

    }
    %>
<html>
    <head>
        <link rel="shortcut icon" href="Favicon.ico?" type="image/x-icon" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/trianglify/0.4.0/trianglify.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FortBook - Home</title>
        <style>
            @import url('https://fonts.googleapis.com/css?family=Source+Sans+Pro');
            @import url('https://fonts.googleapis.com/css?family=Courgette');
            @import url('https://fonts.googleapis.com/css?family=Exo+2');

            .gold:hover{
                background-color: #ffe484;
            }
             @font-face {
                font-family: LuckiestGuy;
                src: url(assets/fonts/lucky.ttf);
             }
             #logo{
                  font-family: LuckiestGuy;
             }
              #bio{
                  font-family: LuckiestGuy;
             }
             #username{
                  font-family: 'Exo 2', sans-serif;
             }
             img{
                 margin-bottom: 5px;
             }
             textarea
                {
                 font-size:50px;
                 font-family: 'Source Sans Pro', sans-serif;
                }
                
            #statuspost{
                font-family: 'Courgette', cursive;
                color:#3e4043;
                size: 40px;
            }
            .navbar-light .navbar-brand {
                color: rgba(255, 255, 255, 0.9);
            }
            .navbar-light .navbar-nav .nav-link {
                color: rgb(255, 255, 255);
            }
            .navbar-light .navbar-nav .active>.nav-link, .navbar-light .navbar-nav .nav-link.active, .navbar-light .navbar-nav .nav-link.show, .navbar-light .navbar-nav .show>.nav-link {
                background-color: rgb(255, 255, 255);
            }
           #likeicon {
    background: url(assets/images/likes.png);
    border: 0;
    display: block;
    height: 10px;
    width: 10px;
}

        </style>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color:#563d7c;color:white;">
  <a class="navbar-brand" href="home.jsp" id="logo">FortBook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="home.jsp">Home </a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="friends.jsp">Friends<span class="sr-only">(current)</span></a>
      </li>

    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Find friends..." aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
      &nbsp;&nbsp;
      <a class="btn gold" style="font-weight: 500;color: #ffe484;border-color: #ffe484;" role="button" href="logout.jsp" >
      Logout
      </a>
  </div>
</nav>
        <div class="container">
  <div class="row">
    <div class="col-4" style="border-right: 30px;">
        <div style="margin-top:10px;">
            <img src="assets/images/user.jpg" alt="user" style="width: 200px; height: 200px;" class="img-thumbnail">
            <br>
            <br>
<% 
    String uname ="";
    int ver= 0;
    String email = session.getAttribute("loggedInUser").toString();
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
    Statement st = con.createStatement();
    Statement st2 = con.createStatement();

    ResultSet rs,friendDetails;
    rs = st.executeQuery("select username from users where email='" + email + "'");
    friendDetails =st2.executeQuery("select verified from users where email='" + email + "'");
    
    if (rs.next()) {
         uname = rs.getString("username");
    }
    if(friendDetails.next()){
        if(friendDetails.getBoolean("VERIFIED")){
            ver = 1;
        }
    }
%>
<h2 id="username"><% out.println(uname); if(ver == 1){ %> <img width="18px" height="18px" src="assets/images/verif.png"> <% } %></h2>
        </div>
        <button type="button" class="btn btn-primary">
  Friends <span class="badge badge-light">9</span>
</button>
    </div>
       <div class="col-lg-8">
         <div style="margin-top:10px">
            <h2 class="display-6" id="bio">Find your friends on FortBook</h2>
         <div class="jumbotron">
                <div class="row" style="margin:30px;">
                    
                  <!--LOOP FRIEND SEARCH -->
                  <div class="card text-white border-success mb-3" style="width: 18rem; margin:5px;">
                    
                        <div class="card-body">
            <img src="assets/images/user.jpg" alt="user" style="width: 100px; height: 100px;" class="img-thumbnail">
            <h5 class="card-title" id="username" style="color:black;">PS Narayanan </h5>

                        </div>
                      <div class="card-header text-success"><button type="button" class="btn btn-primary">
                            Friends
                            </button></div>
                    </div>  
                  <div class="card text-white border-success mb-3" style="width: 18rem; margin:5px;">

                        <div class="card-body">
            <img src="assets/images/user.jpg" alt="user" style="width: 100px; height: 100px;" class="img-thumbnail">
            <h5 class="card-title" id="username" style="color:black;">World of Warcraft </h5>

                        </div>
                                          <div class="card-header text-success"><button type="button" class="btn btn-success">
                            Add Friend
                            </button></div>
                    </div>
                   <!-- LOOP END -->

                </div>
            
         </div>
          </div>
       </div>
 </div>
        
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>



								