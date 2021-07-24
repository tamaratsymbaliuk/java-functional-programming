package supplierInterface;

public class SupplierInterface {

    //Supplier has a single abstract method called GET and it accept no parameter and return type T

    @FunctionalInterface
    interface Supplier<String>{

        String get();

    }

    Supplier<String > providedStr = ()-> new String("Hello Tamara!");

}
