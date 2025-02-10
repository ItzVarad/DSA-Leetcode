class Solution {
    public String defangIPaddr(String address) {
        StringBuilder strB = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i) == '.'){
                strB.append("[.]");
            } else{
                strB.append(address.charAt(i));
            }
        }
        return strB.toString();
    }
}