import java.io.*;
import java.util.*;

public class task3 {
    public static int solve(int input1) {
        int temp = input1;
        int rev = 0;
        
        while (input1 > 0) {
            rev = rev * 10 + input1 % 10;
            input1 /= 10;
        }
        
        if (rev != temp) return 1;
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(solve(121));
        System.out.println(solve(123));
    }
}
