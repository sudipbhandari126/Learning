package lambdas;

public class Hello {
    public static void main(String[] args) {
        Fun<Double, Double> fun = (x) -> x * 2 + 1;
        System.out.println("hello:: "+ fun);
    }
    @FunctionalInterface
    public interface Fun<T, R> {
        R apply(T t);
        static void doNothingStatic() { }
        default void doNothingByDefault() { }
    }

}
