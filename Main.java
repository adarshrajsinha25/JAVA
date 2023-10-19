import java.util.Scanner;

public class Main{
    // Returns the length of the longest palindromic subsequence in 'str'
    static int minimumNumberOfDeletions(String str) {
        int n = str.length();
        // Creating a 2D array that stores the value of minimum deletions required for the substring ranging from index i to j in arr[i][j].
        int [][] arr = new int[n][n];

        // All substrings that are one character long dont need any deletion so their value is set to 0.
        for(int i = 0; i < n; i++){  
            arr[i][i] = 0;
        }

        // Computing min. number of deletions for other Substrings
        for(int len = 2; len <= n; len++){ // Initializing a loop from 2 to 7 which are the lengths of substrings possible.
            // The for loop below considers the substrings, wherein it checks if the characters at the end are same. If they are
            // then it sets the value of deletions to the value at arr[i+1][j-1] which is the value of the characters at second and 
            // second last positions and so on....
            // If the characters at end are different, there are two ways- delete the character at i'th position or the j'th position.
            // We consider the minimum of both Cases.
            for(int i = 0; i < n-len+1; i++){ 
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    arr[i][j] = arr[i + 1][j - 1];
                } else {
                    arr[i][j] = 1 + Math.min(arr[i + 1][j], arr[i][j - 1]);
                }
            }
        }

        // Finally after computing the Min. Deletions of all substrings we return the value of arr[0][n-1] which is the value for 
        // the whole string ranging from 0 to n-1.
        return arr[0][n-1];
    }  

    // Driver Code
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        str =  sc.nextLine();
        System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(str));
    }
}
