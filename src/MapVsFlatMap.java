import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b", "c", "d");
        List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperList);
        List<List<Integer>> phoneList = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        System.out.println(phoneList);

        Stream<String> charStream = Stream.of("a", "b", "c", "d") ;

    }
}
