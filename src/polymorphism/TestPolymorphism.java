package polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		Parent p = new Parent("raja");
		System.out.println(p.getName());
		p.superMethod();
		
		System.out.print(p.add(5));
	}

}
