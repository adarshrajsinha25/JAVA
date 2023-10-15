import java.util.Scanner;

public class Main{
    // Returns the length of the longest palindromic subsequence in 'str'
    static int lps(String str) {
        int n = str.length();
 
        // Array to store computation of subproblems
        int[] L = new int[n];
 
        // Iterate over subproblems to get the current value from previous computation
        for (int i = n - 1; i >= 0; i--) {
            // To store previous values
            int back_up = 0;
            for (int j = i; j < n; j++) {
                if (j == i)
                    L[j] = 1;
                else if (str.charAt(i) == str.charAt(j)) {
                    int temp = L[j];
                    L[j] = back_up + 2;
                    back_up = temp;
                } else {
                    back_up = L[j];
                    L[j] = Math.max(L[j], L[j - 1]);
                }
            }
        }
 
        // Return final answer
        return L[n - 1];
    }
 
    // Function to calculate minimum number of deletions
    static int minimumNumberOfDeletions(String str) {
        int n = str.length();
 
        // Find longest palindromic subsequence
        int len = lps(str);
 
        // After removing characters other than the lps, we get a palindrome.
        return (n - len);
    }
 
    // Driver Code
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(str));
    }
}
