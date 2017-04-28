<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Books.aspx.cs" Inherits="BookstoreWebForms.Books" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="row">
        <div class="col-md-4">
            <div class="btn-group-vertical btn-block">
                <asp:ListView ID="ListView1" runat="server" DataSourceID="categoriesDataSource">
                    <ItemTemplate>
                        <asp:HyperLink runat="server" Text='<%# Eval("Name") %>' NavigateUrl='<%# "?id=" + Eval("CategoryID") %>' CssClass="btn btn-lg btn-info"></asp:HyperLink>
                    </ItemTemplate>
                </asp:ListView>
            </div>
        </div>
        <div class="col-md-8">
            <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" DataSourceID="booksDataSource" CssClass="table table-striped table-hover table-bordered">
                <Columns>
                    <asp:BoundField DataField="BookID" HeaderText="BookID" SortExpression="BookID"></asp:BoundField>
                    <asp:BoundField DataField="Title" HeaderText="Title" SortExpression="Title"></asp:BoundField>
                    <asp:BoundField DataField="Year" HeaderText="Year" SortExpression="Year"></asp:BoundField>
                    <asp:BoundField DataField="Price" HeaderText="Price" SortExpression="Price"></asp:BoundField>
                </Columns>
            </asp:GridView>
        </div>
    </div>
    <asp:ObjectDataSource runat="server" ID="booksDataSource" SelectMethod="GetBooksByCategory" TypeName="BookstoreService.Services.BooksService">
        <SelectParameters>
            <asp:QueryStringParameter QueryStringField="id" Type="Int32" ConvertEmptyStringToNull="true" Name="categoryId" />
        </SelectParameters>
    </asp:ObjectDataSource>
    <asp:ObjectDataSource runat="server" ID="categoriesDataSource" SelectMethod="GetAllCategories" TypeName="BookstoreService.Services.BooksService"></asp:ObjectDataSource>
</asp:Content>
