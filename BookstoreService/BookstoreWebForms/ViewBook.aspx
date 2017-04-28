<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="ViewBook.aspx.cs" Inherits="BookstoreWebForms.ViewBook" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <asp:FormView ID="FormView1" runat="server" DataSourceID="booksDataSource">
        <ItemTemplate>
            <div class="col-md-3">
                <asp:Image runat="server" ID="Cover" ImageUrl='<%# "~/Cover.ashx?id=" + Eval("BookID") %>' Width="100%" />
            </div>
            <div class="col-md-9">
                <h1>
                    <asp:Label Text='<%# Bind("Title") %>' runat="server" ID="TitleLabel" /></h1>

                <div class="description">
                    <asp:Label Text='<%# Bind("Description") %>' runat="server" ID="DescriptionLabel" /><br />
                </div>

                <p>
                    Year:
                    <asp:Label Text='<%# Bind("Year") %>' runat="server" ID="YearLabel" />
                </p>

                <p>
                    ISBN:
                    <asp:Label Text='<%# Bind("ISBN") %>' runat="server" ID="ISBNLabel" />
                </p>

                <h3>Price:
                    <asp:Label Text='<%# Bind("Price") %>' runat="server" ID="PriceLabel" /></h3>

                <asp:Button runat="server" ID="BuyButton" Text="Добави" OnClick="BuyButton_Click" CssClass="btn btn-lg btn-success"></asp:Button>
            </div>
        </ItemTemplate>
    </asp:FormView>

    <div class="row">
        <a href="javascript:history.go(-1);" class="btn btn-default pull-right"><i class="glyphicon glyphicon-arrow-left">i> Назадa></i></a>
    </div>

    <asp:ObjectDataSource runat="server" ID="ObjectDataSource1" SelectMethod="GetBook" TypeName="BookstoreWebForms.BookstoreService.BooksServiceClient">
        <SelectParameters>
            <asp:QueryStringParameter QueryStringField="id" Type="Int32" ConvertEmptyStringToNull="true" Name="id" />
        </SelectParameters>
    </asp:ObjectDataSource>
</asp:Content>
