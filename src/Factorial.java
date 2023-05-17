
public class Factorial {
	 public static void main(String args[]) {
		// TODO Auto-generated method stub
        int result = factorial(3);
        System.out.print(result);
	}

	private static int factorial(int i) {
		// TODO Auto-generated method stub
		if(i==1) {
			return 1;
		}else return i * factorial(i-1);
		
	}

}
