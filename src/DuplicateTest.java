import java.util.*;
import java.util.stream.Collectors;

public class DuplicateTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(3);
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(Integer value: linkedList) {
            if(map.get(value)==null) {
                map.put(value,1);
            }
            else {
                int valueinMap = map.get(value);
                map.put(value,valueinMap+1);
                set.add(value);
            }
        }
        System.out.println(set);

        List<Integer> list = Arrays.asList(1, 10, 20, 41, 50, 91);
        Integer result = list.stream().sorted().skip(2).limit(1).findAny().get();
        System.out.println(result);

    }
}
