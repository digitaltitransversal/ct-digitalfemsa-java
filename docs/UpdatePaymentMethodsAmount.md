

# UpdatePaymentMethodsAmount

## oneOf schemas
* [Long](Long.md)
* [String](String.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.UpdatePaymentMethodsAmount;
import io.digitalfemsa.model.Long;
import io.digitalfemsa.model.String;

public class Example {
    public static void main(String[] args) {
        UpdatePaymentMethodsAmount exampleUpdatePaymentMethodsAmount = new UpdatePaymentMethodsAmount();

        // create a new Long
        Long exampleLong = new Long();
        // set UpdatePaymentMethodsAmount to Long
        exampleUpdatePaymentMethodsAmount.setActualInstance(exampleLong);
        // to get back the Long set earlier
        Long testLong = (Long) exampleUpdatePaymentMethodsAmount.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set UpdatePaymentMethodsAmount to String
        exampleUpdatePaymentMethodsAmount.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleUpdatePaymentMethodsAmount.getActualInstance();
    }
}
```


