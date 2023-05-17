import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenTest {

    @Test
    public void whenNamesPresentUseBothConsumer() {
        List<String> cities = Arrays.asList("Sydney","Bangkok","Newyork");
        //uppercase consumer
        Consumer<List<String>> uppercaseString = list -> {
            for (int i =0; i < list.size() ; i++) {
                list.set(i,list.get(i).toUpperCase());
            }
        };
        // print list
        Consumer<List<String>> printList = list -> list.stream().forEach(System.out::println);
        // now call the both functions
        uppercaseString.andThen(printList).accept(cities);
        printList.andThen(uppercaseString).accept(cities);
    }

}
