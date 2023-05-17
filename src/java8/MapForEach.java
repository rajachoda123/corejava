package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MapForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)->System.out.println("key is :" +k +" value is :"+v));
		items.forEach((k,v)-> {
			if("E".equals(k)) {
				System.out.println("Hello "+ k +" value is "+ v);
			}
		});
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		List<Integer> ls1 = Arrays.asList(5,4,3,2,1);
		ls.forEach(k -> {
			if(k.equals(3)) {
				System.out.println("i am "+k);
			}
		});
		
		//List<Integer> listInt = new ArrayList<>();
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		listOfList.add(ls);
		listOfList.add(ls1);
		MyConsumer1 action = new MyConsumer1();
		listOfList.forEach(action);
		
	}

}
class MyConsumer1 implements Consumer<List<Integer>> {

	@Override
	public void accept(List<Integer> t) {
		t.forEach(k->System.out.println("kaka" + k));
	}
	
}
