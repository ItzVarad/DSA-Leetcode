class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int len = len1 > len2 ? len2 : len1;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        for(int i = len; i < len1; i++){
            str.append(word1.charAt(i));
        }
        for(int i = len; i < len2; i++){
            str.append(word2.charAt(i));
        }
        return str.toString();
    }
}