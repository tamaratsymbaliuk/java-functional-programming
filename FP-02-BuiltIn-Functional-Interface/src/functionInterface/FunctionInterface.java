package functionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> lengthGetter = t -> t.length() ;
                // new StringLengthGetter(); use Lambda instead
        //accept String parameter and return Integer

        System.out.println(lengthGetter.apply("ABC"));  //returning length of 3

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("John");
        names.add("Alex");
        names.add("Alla");
        names.add("Tamara");

        List<Integer> lenlist = new ArrayList<>();
        for (String name: names){
            lenlist.add(lengthGetter.apply(name));
        }

        System.out.println(lenlist);





    }
}
