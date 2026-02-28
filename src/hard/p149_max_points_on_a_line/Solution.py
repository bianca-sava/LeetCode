from collections import defaultdict
from math import inf
from typing import List

class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        n = len(points)
        if n <= 2:
            return n

        max_total = 1

        for i in range(n):
            slopes = defaultdict(int)
            for j in range(i + 1, n):
                dx = points[j][0] - points[i][0]
                dy = points[j][1] - points[i][1]

                if dy == 0 :
                    slope = inf
                else:
                    slope = dx/dy

                slopes[slope] += 1

            if slopes:
                current_max = max(slopes.values()) + 1
                max_total = max(max_total, current_max)

        return max_total

