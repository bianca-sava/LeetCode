package easy.p190_reverse_bits;

public class Solution {
    public int reverseBits1(int n) {
        return Integer.reverse(n);
    }

    public int reverseBits2(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            int l = n & 1 ;
            int t= l<<(31-i);
            res = res|t;
            n = n>>1;
        }
        return res;
    }
}
