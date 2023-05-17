package java8;

public class InheritanceExample {
	static String s = "-";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A[] aa = new A[2];
		A[] ac = new A[2];
		B[] ba = new B[2];
		sifter(aa, ac);
		sifter(aa);
		sifter(ba);
		sifter(7);

		System.out.println(s);
	}

	static void sifter(A[]... a2) {
		s += "1";
	}

	static void sifter(B[]... b1) {
		s += "2";
	}

	static void sifter(B[] b1) {
		s += "3";
	}

	static void sifter(Object o) {
		s += "4";
	}

}

class A {
}

class B extends A {
}