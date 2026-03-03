class Solution:
    # Time complexity: O(n)
    # Space complexity: O(n)
    def isIsomorphic(self, s: str, t: str) -> bool:
        hm = {}
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if s[i] not in hm:
                if t[i] in hm.values():
                    return False
                hm[s[i]] = t[i]
            else:
                if hm[s[i]] != t[i]:
                    return False

        return True
