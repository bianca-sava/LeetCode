package easy.p13_roman_to_integer;

import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I',             1,
                'V',             5,
                'X',             10,
                'L',             50,
                'C',             100,
                'D',             500,
                'M',             1000
        );

        int sum = 0;

        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            sum = sum + map.get(c);
            if ( i>0 && map.get(s.charAt(i-1)) < map.get(s.charAt(i)))
                sum = sum - 2 * map.get(s.charAt(i-1));

        }

        return sum;
    }
}
