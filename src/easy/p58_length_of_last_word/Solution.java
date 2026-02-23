package easy.p58_length_of_last_word;

public class Solution {
    public int lengthOfLastWord1(String s) {
        char[] text = s.toCharArray();
        int i=0;
        int len=0;

        while(i < text.length){
            if(text[i]==' ') i++;
            else if( Character.isLetter(text[i])){
                len=0;
                while(i < text.length && Character.isLetter(text[i])){
                    len++;
                    i++;
                }
            }
        }

        return len;
    }

    public int lengthOfLastWord2(String s) {
        char[] text = s.toCharArray();
        int i=text.length -1;
        int len=0;

        while(i>=0 && !Character.isLetter(text[i])) i--;

        while(i>=0 && Character.isLetter(text[i])){
            len++;
            i--;
        }

        return len;
    }
}
