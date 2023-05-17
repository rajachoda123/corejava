import java8.Customer;

import java.util.*;
import java.util.stream.Collectors;

public class ShopApp {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("Pinky");
        int x = 1_3;
        System.out.println(x*2);

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        //Method 1
        Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
        String str = "apple";
        for(Character ch : str.toCharArray()) {
            charMap.put(ch,charMap.containsKey(ch) ? charMap.get(ch)+1 : 1);
        }
        System.out.println("----------");
        charMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::print);

    }
}
