import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        List<Integer> newNumbers = new ArrayList<>();
        int sum = 1;

        System.out.println("Please, insert the count of the numbers to input.");
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            System.out.println("Please, insert a number.");
            int number = Integer.parseInt(scanner.nextLine());
            numbers.add(number);
            sum *= number;
        }

        for (int i = 0; i < numbers.size(); i++) {
            newNumbers.add(sum / numbers.get(i));
        }
            for (Integer newNumber : newNumbers) {
                System.out.println(newNumber);
            }
    }
}
