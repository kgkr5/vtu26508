import java.io.*;
import java.util.*;

public class task7 {
    public static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(uniqueDigitCount(1223));
        System.out.println(uniqueDigitCount(12345));
        System.out.println(uniqueDigitCount(111));
    }
}
