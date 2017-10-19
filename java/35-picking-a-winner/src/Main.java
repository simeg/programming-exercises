import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> names = new ArrayList<>();

    String name = "anything";
    while (name.length() > 0) {
      System.out.print("Enter a name: ");
      name = scan.nextLine();
      if (name.length() > 0) {
        names.add(name);
      }
    }

    int index = (int) ((Math.random() * names.size()));
    System.out.println(String.format("And the winner is... %s", names.get(index)));
  }
}
