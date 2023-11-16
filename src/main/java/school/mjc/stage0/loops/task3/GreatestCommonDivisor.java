package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        int end = first < second? first:second;
        if(first == 0 || second == 0) {
            System.out.println(first == 0? second:first);
        }
        else {
            for (int i = 1; i <= end; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }
}
