package functionInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsingFunction_w_Comparator {
    public static void main(String[] args) {
        //Comparator is also a Functional Interface, has single method compare(T o1, T o2)
        Comparator<String> lastCharCom =

                //(o1,o2) -> o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1));
                Comparator.comparing(str -> str.substring(str.length()-1)); //simplifying our code

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");
        names.add("Alex");
        names.add("Alla");
        names.add("Tamara");

       //names.sort(lastCharCom);
        names.sort(Comparator.comparing(str -> str.substring(str.length()-1)));

       for (String each: names){
           System.out.println("each item: " + each);
       }
    }
}
