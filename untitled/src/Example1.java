import java.util.function.Function;
import java.util.function.Predicate;

public class Example1 {
    static Function<Integer, Integer> f = i -> i*i;
    static Predicate<Integer> p = i -> i%2 == 0;
    public static void main(String args[]) {
        System.out.println("square of 4:" + f.apply(4));
        System.out.println("even or not:" + p.test(5));
    }
}
