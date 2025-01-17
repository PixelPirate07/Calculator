import java.util.*;

public class Calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(
                "addition" + (a + b) + "subtraction" + (a - b) + "multiplication" + (a * b) + "division" + (a / b)
                        + "smallest" + (Math.min(a, b)));

        // comparison of three numbers
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
        System.out.println("hello world");

        sc.close();
    }

}