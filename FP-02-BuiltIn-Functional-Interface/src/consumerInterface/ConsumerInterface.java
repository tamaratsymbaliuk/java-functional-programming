package consumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> doublePrinter = s -> System.out.println(s + " || "+ s);
                //new StringDoublePrinter();
        doublePrinter.accept("apple");
        doublePrinter.accept("orange");

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");
        names.add("Alex");
        names.add("Alla");
        names.add("Bred");
        names.add("Mike");


        names.forEach(doublePrinter);
        //forEach method - performs the given action for each element of the Iterable
        names.forEach(each -> System.out.println(each + each + each));
    }
}
