using BookstoreService.Entities;
using System.Collections;
using System.ServiceModel;

namespace BookstoreService.Services
{
    [ServiceContract(Namespace = "http://unwe.bg")]
    public interface ICartService
    {

        [OperationContract]
        Cart CreateCart(string userId);
        [OperationContract]
        bool AddToCart(int cartId, int bookId);
        [OperationContract]
        Cart GetCart(int cartId);
        [OperationContract]
        bool RemoveFromCart(int cartId, int bookId);
        [OperationContract]
        bool SetPaymentMethod(int cartId, PaymentMethod method);
        [OperationContract]
        bool SetDeliveryOptions(int cartId, DeliveryOption options);
        [OperationContract]
        bool Purchase(int cartId);

        [OperationContract]
        IEnumerable GetDeliveryOptions();
        [OperationContract]
        IEnumerable GetPaymentMethods();


    }
}
