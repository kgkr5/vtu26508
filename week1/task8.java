import java.io.*;
import java.util.*;

public class task8 {
    public static int mostFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int max = 0, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(1223));
        System.out.println(mostFrequentDigit(1223334444));
        System.out.println(mostFrequentDigit(9999911));
    }
}
