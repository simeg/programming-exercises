import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Input
    Scanner scan = new Scanner(System.in);
    int n = 0;
    ArrayList<Integer> result = new ArrayList<>();

    // Processing
    while (n < 5) {
      System.out.print("Enter a number: ");
      String inputStr = scan.nextLine();
      try {
        int number = Integer.valueOf(inputStr);
        result.add(number);
      } catch (NumberFormatException e) {
        // Do nothing
      }

      n++;
    }

    int sum = result.stream().mapToInt(Integer::intValue).sum();

    // Output
    System.out.println("The result is: " + String.valueOf(sum));
  }
}
