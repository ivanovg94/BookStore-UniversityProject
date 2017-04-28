using BookstoreService.Services;
using BookstoreService.Services.BookstoreService.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Description;
using System.Text;
using System.Threading.Tasks;

namespace BookstoreServiceHost
{
    class Program
    {
        static void Main(string[] args)
        {
            // Дефинираме базовия адрес на услугата (IP и порт, на който да слуша)  
            Uri baseAddress = new Uri("http://127.0.0.1:8123/");

            // Създаваме обект от тип ServiceHost , на който подаваме типа на класа на услугата и горепосочения адрес
            ServiceHost selfHost = new ServiceHost(typeof(BooksService), baseAddress);

            try
            {
                // Добавяме service endpoint, като посочваме интерфейса на услугата, това, че ще използваме HTTP протокола; наименование
                selfHost.AddServiceEndpoint(typeof(IBooksService), new WSHttpBinding(SecurityMode.None), "BooksService");

                // Добавяме възможност за обмен на метаданни (описание на самата услуга, нейните операции и типове данни)  
                ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
                smb.HttpGetEnabled = true;
                selfHost.Description.Behaviors.Add(smb);

                // Стартираме услугата и изчакваме 
                selfHost.Open();
                Console.WriteLine("The service is ready.");
                Console.ReadLine();

                selfHost.Close();
            }
            catch (CommunicationException ce)
            {
                Console.WriteLine("An exception occurred: {0}", ce.Message);
                selfHost.Abort();
                Console.Read();
            }
        }
    }
}