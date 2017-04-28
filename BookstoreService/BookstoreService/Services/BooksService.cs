using BookstoreService.Entities;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Dapper;
using System.Configuration;

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
    }
}
