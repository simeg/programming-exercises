import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Input
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String word1 = scan.nextLine();
    System.out.print("Enter the second string: ");
    String word2 = scan.nextLine();

    // Processing
    boolean result = isAnagram(word1, word2);

    // Output
    if (result) {
      System.out.println(String.format("%s and %s are anagrams.", word1, word2));
    } else {
      System.out.println(String.format("%s and %s are not anagrams.", word1, word2));
    }
  }

  private static boolean isAnagram(String word1, String word2) {
    return word1.length() == word2.length() &&
        stringToSortedList(word1).equals(stringToSortedList(word2));
  }

  private static List<String> stringToSortedList(String input) {
    List<String> list = Arrays.asList(input.split(""));
    list.sort(String::compareToIgnoreCase);
    return list;
  }
}
