package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListToMap {

	public static void main(String[] args) {
		List<Cust> list = Arrays.asList(new Cust("1", "raja"), new Cust("2", "venkat"), new Cust("1", "sai"),new Cust("1","baba"));
        // 1. converting list to map
		Map<String, Cust> map = list.stream()
				.collect(Collectors.toMap(Cust::getCustId, Function.identity(), (key1, key2) -> key2));
		System.out.println(map);
		// 2. creating map grouping based on custId.
		Map<String, List<Cust>> map2 = list.stream().collect(Collectors.groupingBy(Cust::getCustId));
		
		System.out.println("map 2: "+map2.size());
		//finding duplicate elements in stream
		Stream<Integer> inputStream = Stream.of(5, 9, 101, 9, 10, 3, 7, 5);
		Set<Integer> finalSet = new HashSet<>();
		Set<Integer> finalResult = inputStream

				// Set.add() returns false
				// if the element was
				// already present in the set.
				// Hence filter such elements
				.filter(n -> !finalSet.add(n))

				// Collect duplicate elements
				// in the set
				.collect(Collectors.toSet());
		System.out.println("------"+finalResult);
		Stream<Integer> inputStream2 = Stream.of(5, 9, 101, 9, 10, 3, 7, 5);
		System.out.println(findDuplicateInStream(inputStream2));

	}

	private static Set<Integer> findDuplicateInStream(Stream<Integer> inputStream) {
		return inputStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				//check if frequencey
		        .filter(m->m.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
	}

}

class Cust {
	private String custId;
	private String custName;

	/*
	 * public Cust() {
	 * 
	 * }
	 */
	public String getCustId() {
		return custId;
	}

	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", custName=" + custName + "]";
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Cust(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
}