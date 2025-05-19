
import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by commas (e.g. 1,2,8,9): ");
        String inputLine = scanner.nextLine();

        // Parse input string into integer array
        String[] parts = inputLine.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        // Initialize counts to zero
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        // Count multiples
        for (int divisor = 1; divisor <= 9; divisor++) {
            for (int number : numbers) {
                if (number % divisor == 0) {
                    multiplesCount.put(divisor, multiplesCount.get(divisor) + 1);
                }
            }
        }

        
        System.out.print("{");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : multiplesCount.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count < multiplesCount.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}
