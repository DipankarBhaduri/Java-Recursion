public class Main {
    public static void main(String[] args) {
        String string = "racecar";
        boolean b = checkPalindrome(string, 0, string.length() - 1);
        System.out.println(b);
    }

    /**
     * @Get_Count_Of_SubString: Counts the number of non-overlapping occurrences of a substring within a given string.
     * @param string The input string to search within.
     * @param sub    The substring to count occurrences of.
     * @return The count of occurrences of the specified substring within the input string.
     */
    private static int getCountOfSubString(String string, String sub) {
        if(string != null && sub != null && string.length() >= sub.length()) {
            if(string.substring(0,sub.length()).equals(sub)) {
                return 1 + getCountOfSubString(string.substring(sub.length()), sub);
            } else {
                return 0 + getCountOfSubString(string.substring(1), sub);
            }
        } else {
            return 0;
        }
    }

    /**
     * @Removes_vowels: from a given string and returns the modified string.
     * @param string The input string from which vowels will be removed.
     * @return A new string with all vowels removed from the input string.
     */
    private static String removeVowels(String string) {
        if(string != null && string.length() > 0) {
            if("AEIOUaeiou".indexOf(string.charAt(0)) == -1) {
                return string.substring(0,1).concat(removeVowels(string.substring(1)));
            } else {
                return removeVowels(string.substring(1));
            }
        } else {
            return "";
        }
    }

    /**
     * @Reverse_a_String: Write a method that takes a string as input and returns the reverse of the string.
     *                    For example, if the input is "hello," the output should be "olleh."
     * @param ch    The character array to be reversed.
     * @param start The index of the first character in the range to be reversed.
     * @param end   The index of the last character in the range to be reversed.
     */
    private static void reverseOfTheString(char[] ch, int start, int end) {
       if(ch != null && ch.length > 0 && start < end) {
           char c = ch[start];
           ch[start] = ch [end];
           ch[end] = c;
           reverseOfTheString(ch, start + 1, end - 1);
       }else{
           return ;
       }
    }

    private static boolean checkPalindrome(String string, int start, int end) {
        if(string != null && string.length() > 0 && start < end) {
            if(string.charAt(start) != string.charAt(end)){
                return false;
            } else {
                return checkPalindrome(string, start + 1, end - 1);
            }
        }else{
            return true;
        }
    }
}


/**
 * Palindrome Check: Write a method to check if a given string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. For example, "racecar" is a palindrome.
 *
 * Count Words in a String: Create a method that counts the number of words in a given string. Words are separated by spaces. For example, the input "Hello world" should return 2.
 *
 * Remove Substring: Write a method that removes all occurrences of a specified substring from a given string. For example, if the input string is "Java is a programming language" and the substring to remove is "is," the output should be "Java a programming language."
 *
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string "aaabbbcc" would become "a3b3c2."
 *
 * Find Longest Substring Without Repeating Characters: Write a method that finds the longest substring without repeating characters in a given string. For example, in the string "abcabcbb," the longest substring without repeating characters is "abc."
 *
 * Replace Substring with Another String: Create a method that replaces all occurrences of a specified substring with another string in a given string. For example, if the input string is "Hello, World!" and you want to replace "Hello" with "Hi," the output should be "Hi, World!".
 *
 * String Permutations: Write a method to generate all permutations of a string. For example, if the input is "abc," the output should be a list of all possible permutations: "abc," "acb," "bac," "bca," "cab," and "cba."
 *
 * String Reversal with Recursion: Implement a method to reverse a string using recursion instead of iteration.
 *
 * Remove Whitespace: Write a method that removes all whitespace characters (spaces, tabs, and line breaks) from a given string.
 *
 * These problems should provide you with a variety of string manipulation challenges to improve your programming skills in Java.
 */