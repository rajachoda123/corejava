package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedChar {
    public static void main(String[] args) {
        String str = "abaccccddddddfffffdd";
        mostRepeatedChar(str);
    }

    private static void mostRepeatedChar(String str) {
        //convert
        Map<String, Long> resultMap = str.chars().mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //print map
       // resultMap.forEach((character,count) -> System.out.println(character + ": "+ count));

        // most repeated character
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i< charArray.length ; i++) {
            int j = i+1;int count =0;
            while (charArray[i] == charArray[j]){
                j++;
                count++;
            }
            if( map.get(charArray[i]) !=null &&  map.get(charArray[i]) < count ) {
                map.put(charArray[i],count );
            } else {
                map.put(charArray[i],1);
            }
        }
        System.out.println(map);
    }
}
