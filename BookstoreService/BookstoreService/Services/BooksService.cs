using BookstoreService.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookstoreService.Services
{
    public class BooksService
    {
        private IEnumerable<Book> _books;
        private IEnumerable<Category> _categories;

        public BooksService()
        {
            Category _fantasy = new Category() { CategoryID = 1, Name = "Fantasy" };
            Category _science = new Category() { CategoryID = 2, Name = "Science" };

            _categories = new List<Category>() { _fantasy, _science };
            _books = new List<Book>()
            {
                new Book ()
                {
                    BookID=1,
                    Title="Harry Potter and the Philosoper's Stone",
                    Year=1998,
                    Price=30,
                    Category=_fantasy
                },

                new Book()
                {
                    BookID=2,
                    Title="Astronomy",
                    Year=2015,
                    Price=16.50M,
                    Category=_science
                }
            };
        }

        public IEnumerable<Book> GetAllBooks()
        {
            return _books;
        }

        public IEnumerable<Book> GetBooksByCategory(int categoryId)
        {
            return _books.Where(x => x.Category.CategoryID == categoryId);
        }

        public IEnumerable<Book> GetBooksByCategory(Category category)
        {
            return GetBooksByCategory(category.CategoryID);
        }

        public IEnumerable<Category> GetAllCategories()
        {
            return _categories;
        }

    }
}
