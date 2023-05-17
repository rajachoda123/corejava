package polymorphism;

public class Subclass extends Parent {
	
	@Override
	public void superMethod() {
		// TODO Auto-generated method stub
		super.superMethod();

		System.out.println("Sub");
	}
	
	@Override
	public int add(Integer a) {
		return a;
	}
}
