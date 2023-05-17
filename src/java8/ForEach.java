package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	private static List<String> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Sai!");
		list = Arrays.asList("raja", "sai", "baba");
		System.out.println("size is " + list.size());
		MyConsumer action = new MyConsumer();
		list.forEach(action);
	}

}

class MyConsumer implements Consumer<String> {
	public void accept(String str) {
		System.out.println("value is " + str);
	}
}