package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CheckIfPrime {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //printPrime(2);
        printPrime(2,3,4,7);

    }

    private static void printPrime(int... numbers) {
        for (int i = 0 ; i< numbers.length ; i++ ){
            if (numbers[i] < 2){

            } else {
               if( numbers[i] == 2 ) {
                   System.out.println(2);
               }
               int logic = 1;
               for (int j = 2 ; j < numbers[i] ; j++) {
                   if ( numbers[i] % j == 0) {
                       logic =0;
                       break;
                   }
               }
               if (logic == 1) {
                   System.out.println(numbers[i]);
               }
            }// end of else loop
        }
    }
}
