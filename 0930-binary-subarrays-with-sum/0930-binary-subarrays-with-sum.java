class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(sum,1);
        int c = 0;
        for(int num: nums){
            sum+=num;
            if(map.containsKey(sum-goal)){
                c+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}