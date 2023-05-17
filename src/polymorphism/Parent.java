package polymorphism;

public class Parent {

	private String name;

	public Parent() {

	}

	public Parent(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void superMethod() {
		System.out.println("Super...");
	}
	
	/*
	 * public int add(int a) { return a; }
	 */	
	public int add(Integer a) {
		return a * a;
	}
}
