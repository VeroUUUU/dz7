package dz6;

public class fiboNacci {
    public static void main(String[] args) {
        int fib0 = 1;
        int fib1 = 1;
        int fib2;
        System.out.print(fib0 + " " + fib1 +" ");
        for (int i=3; i<=11; i++){
            fib2 = fib0 + fib1;
            System.out.printf(fib2 + " ");
            fib0 = fib1;
            fib1 = fib2;
        }
    }
}
