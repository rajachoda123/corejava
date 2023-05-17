import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalTest {
    public static void main(String[] args) {
        FunctionalInterfaceTest fte = new FunctionalInterfaceTest() {
            @Override
            public void test(int id, String name) {
                System.out.println(id + name);
            }
        };
        fte.test(3, "abc");
        FunctionalInterfaceTest fte1 = new FunctionalInterfaceTest() {
            @Override
            public void test(int id, String name) {
                System.out.println(id + " ---" + name);
            }
        };
        fte1.test(4, "ajav");
        FunctionalInterfaceTest populate = (int id, String name) -> System.out.println(id + "----" + name);
        populate.test(3, "raja");
        FunctionalInterfaceTest  concatenate = (a,b) -> System.out.println(a +"----"+b);
        // calling functions
        concatenate.test(4,"Sai");
        //Predicate
        Predicate<Integer> predicate = kak -> (kak>10);
        Predicate<Integer> isEven = number -> (number %2 ==0);
        Predicate<Integer> isOdd = number -> number%2 !=0;
        System.out.println(isEven.test(30));
        System.out.print(isOdd.test(21));
        // Consumer
        Consumer<Integer> integerConsumer = abc -> System.out.println("op is "+ abc);
        integerConsumer.accept(100);
        Supplier<Integer> supplier =  new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 200;
            }
        };

        Supplier<Integer> supplier1 = () -> 123/20;
        supplier1.get();

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        
        System.out.println(supplier.get());
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(5));
    }
}
