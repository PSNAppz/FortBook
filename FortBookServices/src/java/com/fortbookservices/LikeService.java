/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fortbookservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;

/**
 *
 * @author psn
 */
@WebService(serviceName = "LikeService")
public class LikeService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "likeStatus")
    public void likeStatus(@WebParam(name = "postid") int postid, @WebParam(name = "userid") int userid) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FortBook?zeroDateTimeBehavior=convertToNull",
            "root", "");
    Statement st = con.createStatement();
    Statement checkLike = con.createStatement();
    Statement count = con.createStatement();
    Statement updateLikes = con.createStatement();
    int likes = 0;
    ResultSet cl;
    cl = checkLike.executeQuery("select * from likes where postid ="+postid+" and userid ="+userid);
    if(cl.next()){
        st.execute("delete from likes where postid="+postid+" and userid ="+userid) ;     
        ResultSet rs;
        rs = count.executeQuery("select count(*) from likes where postid="+postid);
        if(rs.next())
            likes = rs.getInt(1);
        updateLikes.execute("update posts set likes="+likes+" where id ="+postid);
            
    }else{
        st.execute("insert into likes(postid,userid) values('"+postid+"','"+userid+"')") ;     
        ResultSet rs;
        rs = count.executeQuery("select count(*) from likes where postid="+postid);
        if(rs.next())
            likes = rs.getInt(1);
        updateLikes.execute("update posts set likes="+likes+" where id ="+postid);
    
        }
    }
}