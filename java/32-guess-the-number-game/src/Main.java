import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    runNumberGame();
  }

  private static void runNumberGame() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Let's play Guess the Number");

    int level = 0;
    while (level < 1 || level > 3) {
      try {
        System.out.print("Pick a difficulty level (1, 2, or 3): ");
        String levelStr = scan.nextLine();
        level = Integer.valueOf(levelStr);
      } catch (NumberFormatException e) {
        // Ignore
      }
    }

    int number = getRandomNumber(level);

    System.out.print("I have my number. What's your guess? ");
    int guess = scan.nextInt();

    int guessCount = 1;
    while (number != guess) {

      if (guess > number) {
        System.out.print("Too high. Guess again: ");
      } else if (guess < number) {
        System.out.print("Too low. Guess again: ");
      }

      guess = scan.nextInt();
      guessCount++;
    }

    System.out.println(getAnswerComment(guessCount));
    System.out.print("Play again? (y/N)");
    scan.nextLine(); // Eat the newline
    String answer = scan.nextLine();

    if (answer.toLowerCase().equals("y")) {
      runNumberGame();
    } else {
      System.out.println("Goodbye!");
    }
  }

  private static int getRandomNumber(int level) {
    if (level == 1) {
      return (int) (Math.random() * 10) + 1;
    } else if (level == 2) {
      return (int) (Math.random() * 100) + 1;
    } else {
      return (int) (Math.random() * 1000) + 1;
    }
  }

  private static String getAnswerComment(int guessCount) {
    if (guessCount == 1) {
      return "You’re a mind reader!";
    } else if (guessCount < 4) {
      return "Most impressive.";
    } else if (guessCount < 6) {
      return "You can do better than that.";
    } else {
      return "Better luck next time.";
    }
  }
}
