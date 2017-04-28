using BookstoreService.Entities;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Dapper;
using System.Configuration;
using BookstoreService.Services.BookstoreService.Services;

namespace BookstoreService.Services
{
    public class BooksService : IBooksService
    {
        private readonly SqlConnection db;

        public BooksService()
        {
            db = new SqlConnection(ConfigurationManager.ConnectionStrings["bookstore"].ConnectionString);
        }

        public IEnumerable<Book> GetAllBooks()
        {
            return db.Query<Book>("SELECT BookID,Title,Year,Price,ISBN,Description,CategoryID FROM Books");
        }

        public IEnumerable<Book> GetBooksByCategory(int categoryId)
        {
            return db.Query<Book>("SELECT BookID,Title,Year,Price,ISBN,Description,CategoryID FROM Books WHERE CategoryID=@cid", new { cid = categoryId });
        }

        public IEnumerable<Book> GetBooksByCategory(Category category)
        {
            return GetBooksByCategory(category.CategoryID);
        }

        public Book GetBook(int id)
        {
            return db.QuerySingle<Book>("SELECT BookID,Title,Year,Price,Cover,ISBN,Description,CategoryID FROM Books WHERE BookID=@bookid", new { bookid = id });
        }

        public Book GetBookByISBN(string isbn)
        {
            return db.QuerySingle<Book>("SELECT BookID,Title,Year,Price,Cover,ISBN,Description,CategoryID FROM Books WHERE ISBN=@isbn", new { isbn = isbn });
        }

        public IEnumerable<Category> GetAllCategories()
        {
            return db.Query<Category>("SELECT * FROM Categories");
        }

        public Book CreateBook(Book book)
        {
            int newId = db.ExecuteScalar<int>(@"INSERT INTO Books (Title,Year,Price,Cover,ISBN,Description,CategoryID) VALUES (@title,@year,@price,@cover,@isbn,@description,@categoryid);
        SELECT CAST(SCOPE_IDENTITY() as int)",
                new
                {
                    title = book.Title,
                    year = book.Year,
                    price = book.Price,
                    cover = book.Cover,
                    isbn = book.ISBN,
                    description = book.Description,
                    categoryid = book.CategoryId
                }
            );
            return GetBook(newId);
        }

        public Book UpdateBook(Book book)
        {
            db.Execute(@"UPDATE Books SET Title=@title,Year=@year,Price=@price,Cover=@cover,ISBN=@isbn,Description=@description,CategoryID=@categoryid
        WHERE BookID=@bookid",
                new
                {
                    bookid = book.BookID,
                    title = book.Title,
                    year = book.Year,
                    price = book.Price,
                    cover = book.Cover,
                    isbn = book.ISBN,
                    description = book.Description,
                    categoryid = book.CategoryId
                }
            );
            return GetBook(book.BookID);
        }

        public void RemoveBook(int bookId)
        {
            db.Execute("DELETE FROM Books WHERE BookID=@bookid", new { bookid = bookId });
        }


    }
}
