import java.io.*;
import java.util.*;

public class task5 {
    public static int countPrimesInRange(int input1, int input2) {
        int count = 0;
        
        for (int d = input1; d <= input2; d++) {
            if (isPrime(d)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimesInRange(10, 20));
        System.out.println(countPrimesInRange(15, 30));
    }
}