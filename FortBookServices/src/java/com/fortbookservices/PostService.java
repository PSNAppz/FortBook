/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fortbookservices;

import java.sql.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author p2mca17033
 */
@WebService(serviceName = "PostService")
public class PostService {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "PostStatus")
    public String PostStatus(@WebParam(name = "text") String text, @WebParam(name = "userid") int userid) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
    Statement st = con.createStatement();
    int likes = 0;
    st.execute("insert into posts(post,likes,userid) values('"+text+"','"+likes+"','"+userid+"')") ;
    return "Success";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteStatus")
    public String DeleteStatus(@WebParam(name = "postid") int postid) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
    Statement st = con.createStatement();
    int likes = 0;
    st.execute("delete from posts where id="+postid) ;
    return "Success";
    }
}
