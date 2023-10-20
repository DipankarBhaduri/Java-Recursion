package recursion;

public class Main {
    public static void main(String[] args) {
        String string = "hello Hello World";
        String result = replaceWithHi(string);
        System.out.println(result);
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
        if(ch == null || ch.length == 0 || start >= end) {
            return;
        }
        char c = ch[start];
        ch[start] = ch [end];
        ch[end] = c;
        reverseOfTheString(ch, start + 1, end - 1);
    }

    /**
     * Recursively checks if a given string is a palindrome.
     * @param string The input string to be checked.
     * @param start  The starting index for comparison.
     * @param end    The ending index for comparison.
     * @return True if the string is a palindrome, false otherwise.
     */
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

    /**
     * Counts the number of words in a given string.
     * This method takes a string as input and counts the number of words in it.
     * Words in the string are separated by spaces. For example, the input "Hello world" should return 2.
     * @param string The input string to count words from.
     * @return The number of words in the input string.
     */
    private static int countWordInString(String string) {
        if(string != null && string.length() > 0) {
            if(string.charAt(0) == ' '){
                return 1 + countWordInString(string.substring(1));
            } else {
                return countWordInString(string.substring(1));
            }
        }else{
            return 0;
        }
    }

    /**
     * Remove Substring: Write a method that removes all occurrences of a specified substring from a given string. For example,
     * if the input string is "Java is a programming language" and the substring to remove is "is,
     * " the output should be "Java a programming language."
     * @param string
     * @return
     */
    public static String removeSubstring(String string, String sub) {
        if(string == null || sub == null || string.isEmpty() || sub.isEmpty() || sub.length() > string.length()) {
            return string;
        }
        if(string.substring(0, sub.length()).equals(sub) && string.length() > sub.length()) {
            return removeSubstring(string.substring(sub.length()+1), sub);
        } else if (string.substring(0, sub.length()).equals(sub)) {
            return removeSubstring(string.substring(sub.length()), sub);
        } else {
            return string.substring(0,1).concat(removeSubstring(string.substring(1), sub));
        }
    }
    /**
     * @Replace_Substring_with_Another_String: Create a method that replaces all occurrences of a specified
     * substring with another string in a given string. For example, if the input string is "Hello, World!"
     * and you want to replace "Hello" with "Hi," the output should be "Hi, World!".
     */
    private static String replaceWithHi(String string) {
        if(string == null || string.length() < 5) {
            return string;
        }

        if(string.substring(0,5).toLowerCase().equals("hello")) {
            return "hi".concat(replaceWithHi(string.substring(5)));
        } else {
            return string.substring(0,1).concat(replaceWithHi(string.substring(1)));
        }
    }
}