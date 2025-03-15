class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if(len1 != len2) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < len1; i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < len2; i++){
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c,map.get(c)-1);
            } else{
                return false;
            }
        }
        return true;
    }
}