<%@ Page Title="" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="CartPay.aspx.cs" Inherits="BookstoreWebForms.CartPay" %>
<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">

<form action="https://demo.epay.bg/" method="post">
        <input type="hidden" name="PAGE" value="credit_paydirect"/>
        <input type="hidden" ID="hEncoded" name="ENCODED" value="<%= _encoded %>" />
        <input type="hidden" ID="hChecksum" name="CHECKSUM" value="<%= _checksum %>" />
        <asp:Button id="btnEPay" runat="server" Text="Плащане с ePay.bg" PostBackUrl="https://demo.epay.bg/" CssClass="btn btn-lg btn-primary"></asp:Button>
    </form>

</asp:Content>
