/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksjava;

import client.Book;
import client.BooksService;
import client.IBooksService;
import javax.xml.ws.soap.AddressingFeature;

/**
 *
 * @author Georgi Ivanov
 */
public class BooksJava {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

 BooksService service = new BooksService();
   IBooksService s = service.getWSHttpBindingIBooksService(new AddressingFeature());
   for(Book b : s.getAllBooks().getBook()) {
      System.out.println(b.getTitle().getValue() + " - " + b.getPrice());
   }


    }
    
}
