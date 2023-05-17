
public class Fibocii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int result = fibnocci(9);
      System.out.print(result);
	}

	private static int fibnocci(int i) {
		// TODO Auto-generated method stub
		if (i==1) {
			return 1;
		}else if (i == 0) {
			return 0;
		} else 
			return fibnocci(i-1)+fibnocci(i-2);
	}

}
