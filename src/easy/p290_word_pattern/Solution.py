class Solution1:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hm ={}
        words = s.split()

        if len(words) != len(pattern): return False

        for i in range (len(pattern)):
            if pattern[i] not in hm :
                if  words[i] in hm.values():
                    return False
                hm[pattern[i]] = words[i]
            else:
                if hm[pattern[i]] != words[i]:
                    return False
        return True


class Solution2:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        return (len(pattern) == len(words) and
                len(set(zip(pattern, words))) == len(set(pattern)) == len(set(words)))