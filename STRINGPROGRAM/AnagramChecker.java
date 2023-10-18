import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {

    // Remove spaces and convert to lowercase for case-insensitive comparison

    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();

    // Sort the characters in both strings

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    // Compare the sorted strings

    return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

    scanner.close();

    if (areAnagrams(str1, str2)) {
        System.out.println("The strings are anagrams.");
    } else {
         System.out.println("The strings are not anagrams.");
    }
    }
}
