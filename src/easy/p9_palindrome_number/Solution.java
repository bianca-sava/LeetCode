package easy.p9_palindrome_number;

class Solution {
    public boolean isPalindrome1(int x) {
        if (x < 0) return false;
        int copy = x;
        int rev = 0;
        while (x > 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return copy == rev;
    }
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i<n/2; i++){
            if (s.charAt(i) != s.charAt(n-1-i))
                return false;
        }

        return true;
    }

}
