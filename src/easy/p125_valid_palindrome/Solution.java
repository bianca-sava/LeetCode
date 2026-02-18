package easy.p125_valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right= s.length() - 1;

        char[] c = s.toCharArray();

        while (left < right) {
            if (!Character.isLetterOrDigit(c[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(c[right])) {
                right--;
            } else {
                if (Character.toLowerCase(c[left]) != Character.toLowerCase(c[right])) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;

    }
}
