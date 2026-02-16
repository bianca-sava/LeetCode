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

    public int romanToInt2(String s) {
        int sum = 0, number = 0, prev = 0;
        for (int i = s.length()-1 ; i>=0; i--){
            switch (s.charAt(i)){
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) sum -= number;
            else sum += number;
            prev = number;
        }

        return sum;
    }
}
