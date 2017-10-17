import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Input
    Scanner scan = new Scanner(System.in);

    System.out.print("Resting Pulse: ");
    int restingPulse = scan.nextInt();

    System.out.print("Age: ");
    int age = scan.nextInt();

    // Processing and output
    printTableHeader();

    int intensity = 55;
    while (intensity <= 95) {
      Double heartRateDouble = Math.floor(heartRateCalculator(age, restingPulse, intensity));
      int heartRate = heartRateDouble.intValue();
      printHeartRateRow(intensity, heartRate);
      intensity += 5;
    }
  }

  private static void printHeartRateRow(int intensity, int heartRate) {
    System.out.println(String.format("%s%%\t\t\t| %s bpm", intensity, heartRate));
  }

  private static float heartRateCalculator(int age, int restingPulse, float intensity) {
    return (((220 - age) - restingPulse) * (intensity / 100)) + restingPulse;
  }

  private static void printTableHeader() {
    System.out.println("Intensity\t| Table");
    System.out.println("------------|--------");
  }
}
