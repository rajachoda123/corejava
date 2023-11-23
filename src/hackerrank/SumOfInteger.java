package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SumOfInteger {
    public static void main(String[] args) {
        int[] input = new int[] {2,3,4,5,6,7};
        int target = 9;
        Map<Integer, Integer> result = findIndexTarget(target, input);
        System.out.println(result);
       // System.out.println(result[1]);

    }

    private static Map<Integer,Integer> findIndexTarget(int target, int[] input) {
        //create map which saves value and index
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> resultMap = new HashMap<>();
        int[] result = new int[2];
        for (int i =0; i < input.length ; i++ ) {
          if ( map.containsKey(target - input[i])) {
             // resultMap.put()
             /* if(resultMap.size() >1) {
                  while (resultMap.entrySet().iterator().hasNext()=)
              }*/
              resultMap.put(input[i],i);
              resultMap.put(target-input[i],map.get(target-input[i]));
              return resultMap;

          }
          map.put(input[i], i);
        }
        return resultMap;
    }
}
