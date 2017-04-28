using BookstoreService.Services;
using System;
using System.Windows.Forms;

namespace BookstoreDesktop
{
    public partial class Books : Form
    {
        private readonly BooksService _service = new BooksService();
        public Books()
        {
            InitializeComponent();
        }

        private void Books_Load(object sender, EventArgs e)
        {
            var categories = _service.GetAllCategories();
            categoryBindingSource.DataSource = categories;         
            
            var books = _service.GetBooksByCategory(Convert.ToInt32(listBox1.SelectedValue));
            bookBindingSource.DataSource = books;
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            var books = _service.GetBooksByCategory(Convert.ToInt32(listBox1.SelectedValue));
            bookBindingSource.DataSource = books;
        }
    }
}
