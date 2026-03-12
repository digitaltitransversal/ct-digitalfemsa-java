

# CustomerPaymentSourcesInner

## oneOf schemas
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.CustomerPaymentSourcesInner;
import io.digitalfemsa.model.PaymentMethodCashRequest;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentSourcesInner exampleCustomerPaymentSourcesInner = new CustomerPaymentSourcesInner();

        // create a new PaymentMethodCashRequest
        PaymentMethodCashRequest examplePaymentMethodCashRequest = new PaymentMethodCashRequest();
        // set CustomerPaymentSourcesInner to PaymentMethodCashRequest
        exampleCustomerPaymentSourcesInner.setActualInstance(examplePaymentMethodCashRequest);
        // to get back the PaymentMethodCashRequest set earlier
        PaymentMethodCashRequest testPaymentMethodCashRequest = (PaymentMethodCashRequest) exampleCustomerPaymentSourcesInner.getActualInstance();
    }
}
```


