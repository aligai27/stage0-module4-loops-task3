package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib1  = 0;
        int fib2 = 1;
        int buff = 0;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(fib1);
            buff = fib2;
            fib2 = fib1 + fib2;
            fib1 = buff;
        }

    }
}
