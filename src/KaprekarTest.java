import java.util.Arrays;

public class KaprekarTest {
    public static void main(String[] args) {
        /*for (int i = 1000; i < 9999; i++) {
        }*/
        kaprekar(1000);
    }

    static int kaprekarRecursion(int n, int prev) {
        if(n==0) return 0;
        int[] digits = new int[4];
        for(int i =0 ; i < n ; i++){
            int lastdigit = n%10;
            digits[i] = lastdigit;
            n = n/10;
        }
        Arrays.sort(digits);
        return 0;
    }

    static int kaprekar(int n) {
        int prev = 0;
        return kaprekarRecursion(n,prev);
    }
}

