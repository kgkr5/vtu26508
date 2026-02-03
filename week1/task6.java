import java.io.*;
import java.util.*;

public class task6 {
    public static int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPowerDigits(153));
        System.out.println(sumOfPowerDigits(9474));
        System.out.println(sumOfPowerDigits(9));
    }
}
