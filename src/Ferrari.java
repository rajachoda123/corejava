
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ferrari implements Vehicle {
    static String producer() {
        return "hello";
    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sai", "baba", "raja", "balu");
        String producer = Vehicle.producer();
        String ferrariProducer = Ferrari.producer();
        System.out.println(producer);
        System.out.println(ferrariProducer);

        // call default method
        Vehicle ferrari = new Ferrari();
        System.out.println(ferrari.getOverview());

        // anymatch method
        nameList.stream().anyMatch(Name::isRealUser);

        //optional of empty
        Optional<Object> emptyOptional = Optional.empty();

        // Optional.ofNullable(getString());

    }
}
class Name {
    public static boolean isRealUser(String user) {
        return true;
    }
}
