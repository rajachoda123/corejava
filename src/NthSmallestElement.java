import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NthSmallestElement {
    public static void main(String[] args) {
        int postion = 3;
        List<Integer> list = Arrays.asList(2, 3, 5, 10, 29, 32);
        Stream<Integer> kthSmallest = list.stream().sorted().skip(postion).limit(1);
        kthSmallest.findFirst();


    }
}
