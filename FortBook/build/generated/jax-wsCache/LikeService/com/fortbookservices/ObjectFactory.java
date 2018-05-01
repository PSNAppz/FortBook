
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

    private final static QName _SQLException_QNAME = new QName("http://fortbookservices.com/", "SQLException");
    private final static QName _LikeStatusResponse_QNAME = new QName("http://fortbookservices.com/", "likeStatusResponse");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://fortbookservices.com/", "ClassNotFoundException");
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
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link LikeStatus }
     * 
     */
    public LikeStatus createLikeStatus() {
        return new LikeStatus();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     */
    public SqlException createSqlException() {
        return new SqlException();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
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
