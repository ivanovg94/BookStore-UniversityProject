
package client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfBook_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "ArrayOfBook");
    private final static QName _Book_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Book");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "ArrayOfCategory");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Category_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Category");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetBooksByCategoryResponseGetBooksByCategoryResult_QNAME = new QName("http://unwe.bg", "GetBooksByCategoryResult");
    private final static QName _GetBookByISBNIsbn_QNAME = new QName("http://unwe.bg", "isbn");
    private final static QName _GetBooksByCategoryCategory_QNAME = new QName("http://unwe.bg", "category");
    private final static QName _GetAllCategoriesResponseGetAllCategoriesResult_QNAME = new QName("http://unwe.bg", "GetAllCategoriesResult");
    private final static QName _GetBookByISBNResponseGetBookByISBNResult_QNAME = new QName("http://unwe.bg", "GetBookByISBNResult");
    private final static QName _GetBooksByCategoryIdResponseGetBooksByCategoryIdResult_QNAME = new QName("http://unwe.bg", "GetBooksByCategoryIdResult");
    private final static QName _GetAllBooksResponseGetAllBooksResult_QNAME = new QName("http://unwe.bg", "GetAllBooksResult");
    private final static QName _BookTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Title");
    private final static QName _BookCover_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Cover");
    private final static QName _BookDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Description");
    private final static QName _BookISBN_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "ISBN");
    private final static QName _GetBookResponseGetBookResult_QNAME = new QName("http://unwe.bg", "GetBookResult");
    private final static QName _CategoryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Name");
    private final static QName _CategoryBooks_QNAME = new QName("http://schemas.datacontract.org/2004/07/BookstoreService.Entities", "Books");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCategoriesResponse }
     * 
     */
    public GetAllCategoriesResponse createGetAllCategoriesResponse() {
        return new GetAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCategory }
     * 
     */
    public ArrayOfCategory createArrayOfCategory() {
        return new ArrayOfCategory();
    }

    /**
     * Create an instance of {@link GetBooksByCategoryResponse }
     * 
     */
    public GetBooksByCategoryResponse createGetBooksByCategoryResponse() {
        return new GetBooksByCategoryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBook }
     * 
     */
    public ArrayOfBook createArrayOfBook() {
        return new ArrayOfBook();
    }

    /**
     * Create an instance of {@link GetBooksByCategoryId }
     * 
     */
    public GetBooksByCategoryId createGetBooksByCategoryId() {
        return new GetBooksByCategoryId();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link GetBooksByCategoryIdResponse }
     * 
     */
    public GetBooksByCategoryIdResponse createGetBooksByCategoryIdResponse() {
        return new GetBooksByCategoryIdResponse();
    }

    /**
     * Create an instance of {@link GetBooksByCategory }
     * 
     */
    public GetBooksByCategory createGetBooksByCategory() {
        return new GetBooksByCategory();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllCategories }
     * 
     */
    public GetAllCategories createGetAllCategories() {
        return new GetAllCategories();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBookByISBNResponse }
     * 
     */
    public GetBookByISBNResponse createGetBookByISBNResponse() {
        return new GetBookByISBNResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBookByISBN }
     * 
     */
    public GetBookByISBN createGetBookByISBN() {
        return new GetBookByISBN();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "ArrayOfBook")
    public JAXBElement<ArrayOfBook> createArrayOfBook(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_ArrayOfBook_QNAME, ArrayOfBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "ArrayOfCategory")
    public JAXBElement<ArrayOfCategory> createArrayOfCategory(ArrayOfCategory value) {
        return new JAXBElement<ArrayOfCategory>(_ArrayOfCategory_QNAME, ArrayOfCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetBooksByCategoryResult", scope = GetBooksByCategoryResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksByCategoryResponseGetBooksByCategoryResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksByCategoryResponseGetBooksByCategoryResult_QNAME, ArrayOfBook.class, GetBooksByCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "isbn", scope = GetBookByISBN.class)
    public JAXBElement<String> createGetBookByISBNIsbn(String value) {
        return new JAXBElement<String>(_GetBookByISBNIsbn_QNAME, String.class, GetBookByISBN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "category", scope = GetBooksByCategory.class)
    public JAXBElement<Category> createGetBooksByCategoryCategory(Category value) {
        return new JAXBElement<Category>(_GetBooksByCategoryCategory_QNAME, Category.class, GetBooksByCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetAllCategoriesResult", scope = GetAllCategoriesResponse.class)
    public JAXBElement<ArrayOfCategory> createGetAllCategoriesResponseGetAllCategoriesResult(ArrayOfCategory value) {
        return new JAXBElement<ArrayOfCategory>(_GetAllCategoriesResponseGetAllCategoriesResult_QNAME, ArrayOfCategory.class, GetAllCategoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetBookByISBNResult", scope = GetBookByISBNResponse.class)
    public JAXBElement<Book> createGetBookByISBNResponseGetBookByISBNResult(Book value) {
        return new JAXBElement<Book>(_GetBookByISBNResponseGetBookByISBNResult_QNAME, Book.class, GetBookByISBNResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetBooksByCategoryIdResult", scope = GetBooksByCategoryIdResponse.class)
    public JAXBElement<ArrayOfBook> createGetBooksByCategoryIdResponseGetBooksByCategoryIdResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetBooksByCategoryIdResponseGetBooksByCategoryIdResult_QNAME, ArrayOfBook.class, GetBooksByCategoryIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetAllBooksResult", scope = GetAllBooksResponse.class)
    public JAXBElement<ArrayOfBook> createGetAllBooksResponseGetAllBooksResult(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_GetAllBooksResponseGetAllBooksResult_QNAME, ArrayOfBook.class, GetAllBooksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Title", scope = Book.class)
    public JAXBElement<String> createBookTitle(String value) {
        return new JAXBElement<String>(_BookTitle_QNAME, String.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Category", scope = Book.class)
    public JAXBElement<Category> createBookCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Cover", scope = Book.class)
    public JAXBElement<byte[]> createBookCover(byte[] value) {
        return new JAXBElement<byte[]>(_BookCover_QNAME, byte[].class, Book.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Description", scope = Book.class)
    public JAXBElement<String> createBookDescription(String value) {
        return new JAXBElement<String>(_BookDescription_QNAME, String.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "ISBN", scope = Book.class)
    public JAXBElement<String> createBookISBN(String value) {
        return new JAXBElement<String>(_BookISBN_QNAME, String.class, Book.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unwe.bg", name = "GetBookResult", scope = GetBookResponse.class)
    public JAXBElement<Book> createGetBookResponseGetBookResult(Book value) {
        return new JAXBElement<Book>(_GetBookResponseGetBookResult_QNAME, Book.class, GetBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Name", scope = Category.class)
    public JAXBElement<String> createCategoryName(String value) {
        return new JAXBElement<String>(_CategoryName_QNAME, String.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BookstoreService.Entities", name = "Books", scope = Category.class)
    public JAXBElement<ArrayOfBook> createCategoryBooks(ArrayOfBook value) {
        return new JAXBElement<ArrayOfBook>(_CategoryBooks_QNAME, ArrayOfBook.class, Category.class, value);
    }

}
