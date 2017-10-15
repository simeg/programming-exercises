import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Input
    Scanner scan = new Scanner(System.in);

    System.out.print("What is the bill amount? ");
    String billAmountInput = scan.next();

    System.out.print("What is the tip rate? ");
    String tipRateInput = scan.next();

    // Processing
    float billAmount = Float.valueOf(billAmountInput);
    float tipRate = Float.valueOf(tipRateInput);

    float tip = billAmount * (tipRate / 100);
    float total = billAmount + tip;

    // Output
    System.out.println(String.format("Tip: $%s", roundToTwoDecimals(tip)));
    System.out.println(String.format("Total: $%s", roundToTwoDecimals(total)));
  }

  private static String roundToTwoDecimals(float input) {
    DecimalFormat df = new DecimalFormat("###.##");
    return df.format(input);
  }
}
