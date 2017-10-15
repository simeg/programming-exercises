import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Input
    Scanner scan = new Scanner(System.in);
    System.out.print("What is the input string? ");
    String inputStr = scan.nextLine();

    // Processing
    inputStr = inputStr.trim();
    String output = String.format("%s has %d characters", inputStr, inputStr.length());

    // Output
    System.out.println(output);
  }
}
