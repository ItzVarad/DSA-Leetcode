class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        StringBuilder str = new StringBuilder();
        StringBuilder output = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(s.charAt(i-1) != ' '){
                    output.insert(0,str);
                    output.insert(0," ");
                    str.setLength(0);
                }
            } else{
                str.append(s.charAt(i));
            }
        }
        output.insert(0,str);
        return output.toString();
    }
}