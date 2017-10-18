import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<String> answers = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");

    System.out.println("What's your question?");
    new Scanner(System.in).nextLine();

    int index = (int) (Math.random() * answers.size());
    System.out.println(answers.get(index));
  }
}
