import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestPrint {
    public static void main(String[] args) {
        Runnable hello_run_method = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello run method");
            }
        };

        Printer printer1 = new Printer() {
            @Override
            public void print() {
                System.out.println(" print Hello");
            }
        };
       Printer printer2 =  () -> { System.out.println("print 2"); };

        hello_run_method.run();
        printer1.print();
        printer2.print();
        // Consumer  : returns void and
        Consumer<String> nameConsumer = t -> System.out.println(t);
        Stream<String> names = Stream.of("Sai", "baba", "jejinayna");
        names.forEach(nameConsumer);
        // Predicate : return boolean

        // Function  :
        // Supplier  :


    }
}
