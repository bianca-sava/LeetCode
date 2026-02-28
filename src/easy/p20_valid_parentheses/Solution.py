class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False
        stack = []
        dic = {'(' : ')', '[': ']', '{':'}'}
        for p in s:
            if p in dic.keys():
                stack.append(p)
            elif not stack or dic.get(stack.pop()) != p:
                return False
        if len(stack) == 0:
            return True
        else:
            return False
