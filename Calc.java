import java.util.*;

public class Calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(
                "addition" + (a + b) + "subtraction" + (a - b) + "multiplication" + (a * b) + "division" + (a / b));
        sc.close();
    }

}