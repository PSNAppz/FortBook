
package com.fortbookservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PostService", targetNamespace = "http://fortbookservices.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PostService {


    /**
     * 
     * @param text
     * @param userid
     * @return
     *     returns java.lang.String
     * @throws ClassNotFoundException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "PostStatus")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "PostStatus", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.PostStatus")
    @ResponseWrapper(localName = "PostStatusResponse", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.PostStatusResponse")
    @Action(input = "http://fortbookservices.com/PostService/PostStatusRequest", output = "http://fortbookservices.com/PostService/PostStatusResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://fortbookservices.com/PostService/PostStatus/Fault/ClassNotFoundException"),
        @FaultAction(className = SQLException_Exception.class, value = "http://fortbookservices.com/PostService/PostStatus/Fault/SQLException")
    })
    public String postStatus(
        @WebParam(name = "text", targetNamespace = "")
        String text,
        @WebParam(name = "userid", targetNamespace = "")
        int userid)
        throws ClassNotFoundException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param postid
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DeleteStatus")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteStatus", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.DeleteStatus")
    @ResponseWrapper(localName = "DeleteStatusResponse", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.DeleteStatusResponse")
    @Action(input = "http://fortbookservices.com/PostService/DeleteStatusRequest", output = "http://fortbookservices.com/PostService/DeleteStatusResponse")
    public String deleteStatus(
        @WebParam(name = "postid", targetNamespace = "")
        int postid);

}
