package java8;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(fact(-30));
    }
    static long fact(long n) {
       n= Math.abs(n);
        long q,  r=1;
        while(n!=1){
            r*= n;
            n--;
        }
        return r;
    }
}
