
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
    private final static QName _ClassNotFoundException_QNAME = new QName("http://fortbookservices.com/", "ClassNotFoundException");
    private final static QName _PostStatus_QNAME = new QName("http://fortbookservices.com/", "PostStatus");
    private final static QName _DeleteStatusResponse_QNAME = new QName("http://fortbookservices.com/", "DeleteStatusResponse");
    private final static QName _DeleteStatus_QNAME = new QName("http://fortbookservices.com/", "DeleteStatus");
    private final static QName _PostStatusResponse_QNAME = new QName("http://fortbookservices.com/", "PostStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fortbookservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link DeleteStatusResponse }
     * 
     */
    public DeleteStatusResponse createDeleteStatusResponse() {
        return new DeleteStatusResponse();
    }

    /**
     * Create an instance of {@link DeleteStatus }
     * 
     */
    public DeleteStatus createDeleteStatus() {
        return new DeleteStatus();
    }

    /**
     * Create an instance of {@link PostStatusResponse }
     * 
     */
    public PostStatusResponse createPostStatusResponse() {
        return new PostStatusResponse();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link PostStatus }
     * 
     */
    public PostStatus createPostStatus() {
        return new PostStatus();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "PostStatus")
    public JAXBElement<PostStatus> createPostStatus(PostStatus value) {
        return new JAXBElement<PostStatus>(_PostStatus_QNAME, PostStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "DeleteStatusResponse")
    public JAXBElement<DeleteStatusResponse> createDeleteStatusResponse(DeleteStatusResponse value) {
        return new JAXBElement<DeleteStatusResponse>(_DeleteStatusResponse_QNAME, DeleteStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "DeleteStatus")
    public JAXBElement<DeleteStatus> createDeleteStatus(DeleteStatus value) {
        return new JAXBElement<DeleteStatus>(_DeleteStatus_QNAME, DeleteStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fortbookservices.com/", name = "PostStatusResponse")
    public JAXBElement<PostStatusResponse> createPostStatusResponse(PostStatusResponse value) {
        return new JAXBElement<PostStatusResponse>(_PostStatusResponse_QNAME, PostStatusResponse.class, null, value);
    }

}
