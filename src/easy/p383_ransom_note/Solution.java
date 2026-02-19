package easy.p383_ransom_note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i =0; i<magazine.length();i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i =0; i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0) return false;
            else map.put(c, map.get(c)-1);
        }

        return true;
    }
}
