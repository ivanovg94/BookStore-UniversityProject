using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookstoreService.Entities
{
    public class Book
    {

        public int BookID { get; set; }

        public string Title { get; set; }

        public int Year { get; set; }

        public decimal Price { get; set; }

        public Category Category { get; set; }

    }
}
