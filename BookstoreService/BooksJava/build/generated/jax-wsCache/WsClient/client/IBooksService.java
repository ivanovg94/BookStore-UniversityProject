
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBooksService", targetNamespace = "http://unwe.bg")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBooksService {


    /**
     * 
     * @return
     *     returns client.ArrayOfBook
     */
    @WebMethod(operationName = "GetAllBooks", action = "http://unwe.bg/IBooksService/GetAllBooks")
    @WebResult(name = "GetAllBooksResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetAllBooks", targetNamespace = "http://unwe.bg", className = "client.GetAllBooks")
    @ResponseWrapper(localName = "GetAllBooksResponse", targetNamespace = "http://unwe.bg", className = "client.GetAllBooksResponse")
    public ArrayOfBook getAllBooks();

    /**
     * 
     * @return
     *     returns client.ArrayOfCategory
     */
    @WebMethod(operationName = "GetAllCategories", action = "http://unwe.bg/IBooksService/GetAllCategories")
    @WebResult(name = "GetAllCategoriesResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetAllCategories", targetNamespace = "http://unwe.bg", className = "client.GetAllCategories")
    @ResponseWrapper(localName = "GetAllCategoriesResponse", targetNamespace = "http://unwe.bg", className = "client.GetAllCategoriesResponse")
    public ArrayOfCategory getAllCategories();

    /**
     * 
     * @param categoryId
     * @return
     *     returns client.ArrayOfBook
     */
    @WebMethod(operationName = "GetBooksByCategoryId", action = "http://unwe.bg/IBooksService/GetBooksByCategoryId")
    @WebResult(name = "GetBooksByCategoryIdResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetBooksByCategoryId", targetNamespace = "http://unwe.bg", className = "client.GetBooksByCategoryId")
    @ResponseWrapper(localName = "GetBooksByCategoryIdResponse", targetNamespace = "http://unwe.bg", className = "client.GetBooksByCategoryIdResponse")
    public ArrayOfBook getBooksByCategoryId(
        @WebParam(name = "categoryId", targetNamespace = "http://unwe.bg")
        Integer categoryId);

    /**
     * 
     * @param category
     * @return
     *     returns client.ArrayOfBook
     */
    @WebMethod(operationName = "GetBooksByCategory", action = "http://unwe.bg/IBooksService/GetBooksByCategory")
    @WebResult(name = "GetBooksByCategoryResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetBooksByCategory", targetNamespace = "http://unwe.bg", className = "client.GetBooksByCategory")
    @ResponseWrapper(localName = "GetBooksByCategoryResponse", targetNamespace = "http://unwe.bg", className = "client.GetBooksByCategoryResponse")
    public ArrayOfBook getBooksByCategory(
        @WebParam(name = "category", targetNamespace = "http://unwe.bg")
        Category category);

    /**
     * 
     * @param id
     * @return
     *     returns client.Book
     */
    @WebMethod(operationName = "GetBook", action = "http://unwe.bg/IBooksService/GetBook")
    @WebResult(name = "GetBookResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetBook", targetNamespace = "http://unwe.bg", className = "client.GetBook")
    @ResponseWrapper(localName = "GetBookResponse", targetNamespace = "http://unwe.bg", className = "client.GetBookResponse")
    public Book getBook(
        @WebParam(name = "id", targetNamespace = "http://unwe.bg")
        Integer id);

    /**
     * 
     * @param isbn
     * @return
     *     returns client.Book
     */
    @WebMethod(operationName = "GetBookByISBN", action = "http://unwe.bg/IBooksService/GetBookByISBN")
    @WebResult(name = "GetBookByISBNResult", targetNamespace = "http://unwe.bg")
    @RequestWrapper(localName = "GetBookByISBN", targetNamespace = "http://unwe.bg", className = "client.GetBookByISBN")
    @ResponseWrapper(localName = "GetBookByISBNResponse", targetNamespace = "http://unwe.bg", className = "client.GetBookByISBNResponse")
    public Book getBookByISBN(
        @WebParam(name = "isbn", targetNamespace = "http://unwe.bg")
        String isbn);

}
