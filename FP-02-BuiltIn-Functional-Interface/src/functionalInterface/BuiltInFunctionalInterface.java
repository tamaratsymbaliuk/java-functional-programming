package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInFunctionalInterface {
    public static void main(String[] args) {
      // Predicate<String> moreThan5Char = new MoreThan5CharChecker();

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");
        names.add("Alex");
        names.add("Alla");
        names.add("Bred");

       // names.removeIf(moreThan5Char);
       // System.out.println(names);

        //Now I'll use Lambda instead

        Predicate<String> moreThan5Char = s -> s.length() > 5;

        names.removeIf(name -> name.length()>4);
        System.out.println(names);



    }
}
