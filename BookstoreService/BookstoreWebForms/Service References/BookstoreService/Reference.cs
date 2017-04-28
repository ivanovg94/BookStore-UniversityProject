﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace BookstoreWebForms.BookstoreService {
    using System.Runtime.Serialization;
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Book", Namespace="http://schemas.datacontract.org/2004/07/BookstoreService.Entities")]
    [System.SerializableAttribute()]
    public partial class Book : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int BookIDField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private BookstoreWebForms.BookstoreService.Category CategoryField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int CategoryIdField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private byte[] CoverField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string DescriptionField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string ISBNField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private decimal PriceField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string TitleField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int YearField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int BookID {
            get {
                return this.BookIDField;
            }
            set {
                if ((this.BookIDField.Equals(value) != true)) {
                    this.BookIDField = value;
                    this.RaisePropertyChanged("BookID");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public BookstoreWebForms.BookstoreService.Category Category {
            get {
                return this.CategoryField;
            }
            set {
                if ((object.ReferenceEquals(this.CategoryField, value) != true)) {
                    this.CategoryField = value;
                    this.RaisePropertyChanged("Category");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int CategoryId {
            get {
                return this.CategoryIdField;
            }
            set {
                if ((this.CategoryIdField.Equals(value) != true)) {
                    this.CategoryIdField = value;
                    this.RaisePropertyChanged("CategoryId");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public byte[] Cover {
            get {
                return this.CoverField;
            }
            set {
                if ((object.ReferenceEquals(this.CoverField, value) != true)) {
                    this.CoverField = value;
                    this.RaisePropertyChanged("Cover");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string Description {
            get {
                return this.DescriptionField;
            }
            set {
                if ((object.ReferenceEquals(this.DescriptionField, value) != true)) {
                    this.DescriptionField = value;
                    this.RaisePropertyChanged("Description");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string ISBN {
            get {
                return this.ISBNField;
            }
            set {
                if ((object.ReferenceEquals(this.ISBNField, value) != true)) {
                    this.ISBNField = value;
                    this.RaisePropertyChanged("ISBN");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public decimal Price {
            get {
                return this.PriceField;
            }
            set {
                if ((this.PriceField.Equals(value) != true)) {
                    this.PriceField = value;
                    this.RaisePropertyChanged("Price");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string Title {
            get {
                return this.TitleField;
            }
            set {
                if ((object.ReferenceEquals(this.TitleField, value) != true)) {
                    this.TitleField = value;
                    this.RaisePropertyChanged("Title");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int Year {
            get {
                return this.YearField;
            }
            set {
                if ((this.YearField.Equals(value) != true)) {
                    this.YearField = value;
                    this.RaisePropertyChanged("Year");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Category", Namespace="http://schemas.datacontract.org/2004/07/BookstoreService.Entities")]
    [System.SerializableAttribute()]
    public partial class Category : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private BookstoreWebForms.BookstoreService.Book[] BooksField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int CategoryIDField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string NameField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public BookstoreWebForms.BookstoreService.Book[] Books {
            get {
                return this.BooksField;
            }
            set {
                if ((object.ReferenceEquals(this.BooksField, value) != true)) {
                    this.BooksField = value;
                    this.RaisePropertyChanged("Books");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int CategoryID {
            get {
                return this.CategoryIDField;
            }
            set {
                if ((this.CategoryIDField.Equals(value) != true)) {
                    this.CategoryIDField = value;
                    this.RaisePropertyChanged("CategoryID");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string Name {
            get {
                return this.NameField;
            }
            set {
                if ((object.ReferenceEquals(this.NameField, value) != true)) {
                    this.NameField = value;
                    this.RaisePropertyChanged("Name");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://unwe.bg", ConfigurationName="BookstoreService.IBooksService")]
    public interface IBooksService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetAllBooks", ReplyAction="http://unwe.bg/IBooksService/GetAllBooksResponse")]
        BookstoreWebForms.BookstoreService.Book[] GetAllBooks();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetAllBooks", ReplyAction="http://unwe.bg/IBooksService/GetAllBooksResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetAllBooksAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetAllCategories", ReplyAction="http://unwe.bg/IBooksService/GetAllCategoriesResponse")]
        BookstoreWebForms.BookstoreService.Category[] GetAllCategories();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetAllCategories", ReplyAction="http://unwe.bg/IBooksService/GetAllCategoriesResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Category[]> GetAllCategoriesAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBooksByCategoryId", ReplyAction="http://unwe.bg/IBooksService/GetBooksByCategoryIdResponse")]
        BookstoreWebForms.BookstoreService.Book[] GetBooksByCategoryId(int categoryId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBooksByCategoryId", ReplyAction="http://unwe.bg/IBooksService/GetBooksByCategoryIdResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetBooksByCategoryIdAsync(int categoryId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBooksByCategory", ReplyAction="http://unwe.bg/IBooksService/GetBooksByCategoryResponse")]
        BookstoreWebForms.BookstoreService.Book[] GetBooksByCategory(BookstoreWebForms.BookstoreService.Category category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBooksByCategory", ReplyAction="http://unwe.bg/IBooksService/GetBooksByCategoryResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetBooksByCategoryAsync(BookstoreWebForms.BookstoreService.Category category);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBook", ReplyAction="http://unwe.bg/IBooksService/GetBookResponse")]
        BookstoreWebForms.BookstoreService.Book GetBook(int id);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBook", ReplyAction="http://unwe.bg/IBooksService/GetBookResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book> GetBookAsync(int id);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBookByISBN", ReplyAction="http://unwe.bg/IBooksService/GetBookByISBNResponse")]
        BookstoreWebForms.BookstoreService.Book GetBookByISBN(string isbn);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://unwe.bg/IBooksService/GetBookByISBN", ReplyAction="http://unwe.bg/IBooksService/GetBookByISBNResponse")]
        System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book> GetBookByISBNAsync(string isbn);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IBooksServiceChannel : BookstoreWebForms.BookstoreService.IBooksService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class BooksServiceClient : System.ServiceModel.ClientBase<BookstoreWebForms.BookstoreService.IBooksService>, BookstoreWebForms.BookstoreService.IBooksService {
        
        public BooksServiceClient() {
        }
        
        public BooksServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public BooksServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public BooksServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public BooksServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public BookstoreWebForms.BookstoreService.Book[] GetAllBooks() {
            return base.Channel.GetAllBooks();
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetAllBooksAsync() {
            return base.Channel.GetAllBooksAsync();
        }
        
        public BookstoreWebForms.BookstoreService.Category[] GetAllCategories() {
            return base.Channel.GetAllCategories();
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Category[]> GetAllCategoriesAsync() {
            return base.Channel.GetAllCategoriesAsync();
        }
        
        public BookstoreWebForms.BookstoreService.Book[] GetBooksByCategoryId(int categoryId) {
            return base.Channel.GetBooksByCategoryId(categoryId);
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetBooksByCategoryIdAsync(int categoryId) {
            return base.Channel.GetBooksByCategoryIdAsync(categoryId);
        }
        
        public BookstoreWebForms.BookstoreService.Book[] GetBooksByCategory(BookstoreWebForms.BookstoreService.Category category) {
            return base.Channel.GetBooksByCategory(category);
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book[]> GetBooksByCategoryAsync(BookstoreWebForms.BookstoreService.Category category) {
            return base.Channel.GetBooksByCategoryAsync(category);
        }
        
        public BookstoreWebForms.BookstoreService.Book GetBook(int id) {
            return base.Channel.GetBook(id);
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book> GetBookAsync(int id) {
            return base.Channel.GetBookAsync(id);
        }
        
        public BookstoreWebForms.BookstoreService.Book GetBookByISBN(string isbn) {
            return base.Channel.GetBookByISBN(isbn);
        }
        
        public System.Threading.Tasks.Task<BookstoreWebForms.BookstoreService.Book> GetBookByISBNAsync(string isbn) {
            return base.Channel.GetBookByISBNAsync(isbn);
        }
    }
}
