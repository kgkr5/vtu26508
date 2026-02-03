import java.io.*;
import java.util.*;

public class task10 {
    public static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(secondWordUpper("hello world"));
        System.out.println(secondWordUpper("hello"));
        System.out.println(secondWordUpper("the quick brown fox"));
    }
}

