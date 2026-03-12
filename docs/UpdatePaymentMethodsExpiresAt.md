

# UpdatePaymentMethodsExpiresAt

## oneOf schemas
* [Long](Long.md)
* [String](String.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.UpdatePaymentMethodsExpiresAt;
import io.digitalfemsa.model.Long;
import io.digitalfemsa.model.String;

public class Example {
    public static void main(String[] args) {
        UpdatePaymentMethodsExpiresAt exampleUpdatePaymentMethodsExpiresAt = new UpdatePaymentMethodsExpiresAt();

        // create a new Long
        Long exampleLong = new Long();
        // set UpdatePaymentMethodsExpiresAt to Long
        exampleUpdatePaymentMethodsExpiresAt.setActualInstance(exampleLong);
        // to get back the Long set earlier
        Long testLong = (Long) exampleUpdatePaymentMethodsExpiresAt.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set UpdatePaymentMethodsExpiresAt to String
        exampleUpdatePaymentMethodsExpiresAt.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleUpdatePaymentMethodsExpiresAt.getActualInstance();
    }
}
```


