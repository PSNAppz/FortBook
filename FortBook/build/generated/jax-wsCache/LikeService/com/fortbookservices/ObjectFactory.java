
package com.fortbookservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fortbookservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LikeStatusResponse_QNAME = new QName("http://fortbookservices.com/", "likeStatusResponse");
    private final static QName _LikeStatus_QNAME = new QName("http://fortbookservices.com/", "likeStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fortbookservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LikeStatusResponse }
     * 
     */
    public LikeStatusResponse createLikeStatusResponse() {
        return new LikeStatusResponse();
    }

    /**
     * Create an instance of {@link LikeStatus }
     * 
     */
    public LikeStatus createLikeStatus() {
        return new LikeStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "likeStatusResponse")
    public JAXBElement<LikeStatusResponse> createLikeStatusResponse(LikeStatusResponse value) {
        return new JAXBElement<LikeStatusResponse>(_LikeStatusResponse_QNAME, LikeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LikeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "likeStatus")
    public JAXBElement<LikeStatus> createLikeStatus(LikeStatus value) {
        return new JAXBElement<LikeStatus>(_LikeStatus_QNAME, LikeStatus.class, null, value);
    }

}
