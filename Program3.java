// File name: Program3.java

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("input a = " + a + ", then output : ");

        int count = (a % 2 == 0) ? a - 1 : a; // Adjust count for even numbers

        for (int i = 1; i <= count; i += 2) {
            System.out.print(i);
            if (i + 2 <= count) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
