package supplierInterface;

import java.util.Random;

public class SupplierInterface {

    //Supplier has a single abstract method called GET and it accept no parameter and return type T

    @FunctionalInterface
    interface Supplier<String>{

        String get();

    }
    //ThreadLocal.withInitial(Supplier<? extends S> supplier); - created a thread local variable

    Supplier<String > providedStr = ()-> new String("Hello Tamara!");
    Supplier<Integer> randomNumber = () -> new Random().nextInt();
    //Supplier<Person> personSupplier = () -> new Person("Tamara", 27);

}
