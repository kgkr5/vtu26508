public class task1 {
    public static int solve(int input1, String input2) {
        int sum = 0;
        while (input1 > 0) {
            int d = input1 % 10;
            if (input2.equals("even") && d % 2 == 0) sum += d;
            else if (input2.equals("odd") && d % 2 != 0) sum += d;
            input1 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solve(12345, "even"));
        System.out.println(solve(12345, "odd"));
    }
}
