using System.Collections.Generic;
using BookstoreService.Entities;

namespace BookstoreService.Services
{
    public interface IBooksService
    {
        IEnumerable<Book> GetAllBooks();
        IEnumerable<Category> GetAllCategories();
        Book GetBook(int id);
        Book GetBookByISBN(string isbn);
        IEnumerable<Book> GetBooksByCategory(int categoryId);
        IEnumerable<Book> GetBooksByCategory(Category category);
    }
}