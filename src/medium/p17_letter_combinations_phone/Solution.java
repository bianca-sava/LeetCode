package medium.p17_letter_combinations_phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    List<String> res = new ArrayList<>();
    Map<Character, String> m = Map.of(
            '2', "abc", '3', "def", '4', "ghi",
            '5', "jkl", '6', "mno", '7', "pqrs",
            '8', "tuv", '9', "wxyz"
    );

    void backtrack(String combination, String nextDigits){
        if(nextDigits.length()==0){
            res.add(combination);
        }
        else{
            String letters = m.get(nextDigits.charAt(0));
            for(char c:letters.toCharArray()){
                backtrack(combination+c, nextDigits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return res;
        }

        backtrack("", digits);

        return res;

    }


}
