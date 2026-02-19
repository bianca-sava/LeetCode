package medium.p172_factorial_trailing_zeroes;

public class Solution {
    public int trailingZeroes(int n) {
        int m = 5;
        int count = 0;
        while(m<=n){
            count += n/m;
            m*=5;
        }
        return count;
    }
}
