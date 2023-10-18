Algorithm for Anagram Detection:

Import necessary packages: 

1. Import java.util.Arrays for array manipulation and java.util.Scanner for user input.

2. Define a class named AnagramChecker.

3. Create a static method named areAnagrams that takes two string parameters, str1 and str2, to check if they are anagrams.

4. Inside the areAnagrams method:
a. Remove spaces from both str1 and str2 using str.replaceAll("\\s", "").
b. Convert both str1 and str2 to lowercase to ensure a case-insensitive comparison using .toLowerCase().
c. Convert str1 and str2 to character arrays, arr1 and arr2, respectively.
d. Sort arr1 and arr2 using Arrays.sort(arr1) and Arrays.sort(arr2).
e. Compare the sorted character arrays using Arrays.equals(arr1, arr2).
f. If the sorted arrays are equal, return true to indicate that the input strings are anagrams; otherwise, return false.

5. In the main method (the entry point of the program):
a. Create a Scanner object to read input from the console.
b. Prompt the user to enter the first string and store it in str1.
c. Prompt the user to enter the second string and store it in str2.
d. Close the Scanner after reading the input.

6. Call the areAnagrams method with str1 and str2 as arguments to determine if the input strings are anagrams.

7. Print a message based on the result:

If the result is true, print "The strings are anagrams."
If the result is false, print "The strings are not anagrams."

Time Complexity:

The time complexity of the code is mainly determined by the sorting step, which uses Arrays.sort(). Sorting has a time complexity of O(n * log(n)), where 'n' is the length of the input strings.

Space Complexity:

The space complexity of the provided code is O(n), where 'n' is the length of the longest input string.