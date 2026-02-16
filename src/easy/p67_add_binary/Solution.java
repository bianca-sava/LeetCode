package easy.p67_add_binary;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int len_a = a.length()-1, len_b = b.length()-1, carry = 0;

        while (len_a >= 0 || len_b >= 0 || carry ==1){
            int sum = carry;
            if (len_a >= 0) sum += a.charAt(len_a--) - '0';
            if (len_b >= 0) sum += b.charAt(len_b--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
