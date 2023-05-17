public class PerfectNumber {
    public static void main(String args[]) {
        int input = 9;
        int sumOfFactors = 0;
        for( int i=1 ; i < input ; i ++ ) {
            if (input%i ==0) {
                sumOfFactors = sumOfFactors+ i ;
            }
        }

        if(sumOfFactors == input) {
            System.out.println("Perfect Number: " + input);
        } else {
            System.out.println("Not Perfect Number : " + input);
        }
    }
}
