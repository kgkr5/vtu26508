import java.io.*;
import java.util.*;

public class task2 {
    public static long nthFibonacci(int input1) {
        if (input1 == 1) return 0;
        if (input1 == 2) return 1;
        
        long a = 0;
        long b = 1;
        long c = 0;
        
        for (int d = 3; d <= input1; d++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(1));
        System.out.println(nthFibonacci(6));
        System.out.println(nthFibonacci(10));
    }
}
