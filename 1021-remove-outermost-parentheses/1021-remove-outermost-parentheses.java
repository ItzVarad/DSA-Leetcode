class Solution {
    public String removeOuterParentheses(String s) {
        int para = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                para++;
                if(para > 1){
                    str.append(ch);
                }
            } else{
                para--;
                if(para > 0){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}