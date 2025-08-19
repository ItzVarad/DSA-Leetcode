class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);

        for(int i =1; i < numRows; i++){
            List<Integer> prev = new ArrayList<>();
            prev.add(1);
            for(int j =1; j < i; j++){
                prev.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            prev.add(1);
            ans.add(prev);   
        }
        return ans;
    }
}