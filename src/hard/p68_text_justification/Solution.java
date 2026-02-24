package hard.p68_text_justification;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int p1 = 0, p2 = 0;
        int sum = 0;
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (p2 < words.length) {
            if (sum + words[p2].length() + (p2 - p1) <= maxWidth) {
                sum += words[p2].length();
                p2++;
                if (p2 == words.length) {
                    while (p1 < p2) {
                        sb.append(words[p1]);
                        if (p1 < p2 - 1) sb.append(" ");
                        p1++;
                    }
                    while (sb.length() < maxWidth) sb.append(" ");
                    res.add(sb.toString());
                }
            }
            else if (sum + words[p2].length() + (p2 - p1) == maxWidth) {
                sum += words[p2].length();
                p2++;
                while (p1 < p2) {
                    sb.append(words[p1]);
                    if (p1 < p2 - 1) sb.append(" ");
                    p1++;
                }
                res.add(sb.toString());
                sb.setLength(0);
                sum = 0;
            }
            else {
                int numberOfWords = p2 - p1;
                int totalSpaces = maxWidth - sum;

                if (numberOfWords == 1) {
                    sb.append(words[p1]);
                    while (sb.length() < maxWidth) sb.append(" ");
                } else {
                    int spacesBetween = totalSpaces / (numberOfWords - 1);
                    int extraSpaces = totalSpaces % (numberOfWords - 1);

                    for (int i = p1; i < p2; i++) {
                        sb.append(words[i]);
                        if (i < p2 - 1) {
                            int sToApply = spacesBetween + ( (i - p1) < extraSpaces ? 1 : 0 );
                            sb.append(" ".repeat(Math.max(0, sToApply)));
                        }
                    }
                }
                res.add(sb.toString());
                sb.setLength(0);
                sum = 0;
                p1 = p2;
            }
        }
        return res;
    }
}
