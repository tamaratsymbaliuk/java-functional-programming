package functionalInterface;

import java.util.function.Predicate;

public class MoreThan5CharChecker implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}
