
package com.fortbookservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LikeService", targetNamespace = "http://fortbookservices.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LikeService {


    /**
     * 
     * @param postid
     * @param userid
     */
    @WebMethod
    @RequestWrapper(localName = "likeStatus", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.LikeStatus")
    @ResponseWrapper(localName = "likeStatusResponse", targetNamespace = "http://fortbookservices.com/", className = "com.fortbookservices.LikeStatusResponse")
    @Action(input = "http://fortbookservices.com/LikeService/likeStatusRequest", output = "http://fortbookservices.com/LikeService/likeStatusResponse")
    public void likeStatus(
        @WebParam(name = "postid", targetNamespace = "")
        int postid,
        @WebParam(name = "userid", targetNamespace = "")
        int userid);

}
