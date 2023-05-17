package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listLowercase = Arrays.asList("a", "b", "c", "d", "e", "a");
		// convert into uppercase
		Stream<String> stream = listLowercase.stream();
		Stream<String> upStream = stream.map(String::toUpperCase);
		Set<String> upperSet = upStream.collect(Collectors.toSet());
		System.out.println(upperSet);
		// single line
		listLowercase.stream().map(String::toLowerCase).collect(Collectors.toSet());

		listLowercase.stream().map(String::toUpperCase).collect(Collectors.toList());

		MathOperation add = (a, b) -> a + b;
		MathOperation sub = (a, b) -> a - b;
		MathOperation mul = (a,b) -> a*b;
		MathOperation div = (a,b) -> a/b;
		
		/*System.out.println("addition : "+add.operate(10, 20));
		System.out.println("subtraction :"+ sub.operate(10, 5));
		System.out.println("multiplication: "+mul.operate(10, 5));
		System.out.println("division is : "+div.operate(10, 5));*/
		
		//1.Predicate 
		Predicate<String> strIsEmpty = str->str.isEmpty();
		//2.Function
		Function<Integer, String> strLength = a->a.toString();
		//3.Consumer
		Consumer<Integer> consu = a ->System.out.println(a.reverse(0));
		//4.Supplier
		Supplier<String> pass = ()->new String("raja");
		
		//Usages ...
		strIsEmpty.test("baba sai baba");
		System.out.println(strLength.apply(123));
		
//		Map<String,String> map = Map.of("raja","sai");
//
//		int[] a = {1,3,4,5,6,7,8,9,10};
//		int length,total;
//		total= (a.length+1) * (a.length+2)/2;
//		System.out.println("total is "+ total);
//		for (int num:a
//			 ) {
//			total-=num;
//		}
//		System.out.println(total);
	}

}

@FunctionalInterface
interface MathOperation {
	public Integer operate(Integer a, Integer b);
	//public Integer kaka(Integer a , Integer b,Integer c);
}