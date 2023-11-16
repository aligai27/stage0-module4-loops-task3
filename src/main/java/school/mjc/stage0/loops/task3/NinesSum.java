package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 9;

        for(int i = 1; i <= lengthOfLastNumber; i++) {
            int pow = 1;
            for(int j = 2; j <= i; j++) {
                number += 9*10*pow;
                pow = pow * 10;
            }
            sum += number;
            number = 9;
        }
        System.out.println(sum);
    }
}
