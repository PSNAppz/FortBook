/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fortbookservices.ClassNotFoundException_Exception;
import com.fortbookservices.SQLException_Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author psn
 */
@WebServlet(urlPatterns = {"/likeStatus"})
public class like extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int postid,userid;
            postid = Integer.parseInt(request.getParameter("postid"));
            userid = Integer.parseInt(request.getParameter("userid"));
            likeStatus(postid,userid);
            response.sendRedirect("home.jsp");

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static void likeStatus(int postid, int userid) {
        com.fortbookservices.LikeService_Service service = new com.fortbookservices.LikeService_Service();
        com.fortbookservices.LikeService port = service.getLikeServicePort();
        try {
            port.likeStatus(postid, userid);
        } catch (ClassNotFoundException_Exception ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException_Exception ex) {
            Logger.getLogger(like.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

    

}
