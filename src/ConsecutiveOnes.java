import java.util.Scanner;
import java.util.Stack;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        Stack<Integer> s= new Stack<>();

        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if (sum > max) max = sum;
            } else sum = 0;
            n = n / 2;
        }
        System.out.println(max);

    }
}
