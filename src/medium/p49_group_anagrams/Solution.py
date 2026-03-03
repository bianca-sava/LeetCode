from collections import defaultdict
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm =defaultdict(list)

        for word in strs:
            count = [0]*26
            for i in range(len(word)):
                count[ord(word[i])-ord("a")] +=1
            hm[tuple(count)].append(word)

        return list(hm.values())
