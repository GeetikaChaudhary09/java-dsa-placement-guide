class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int ans = 0;
        boolean odd = false;
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(int f : freq){
            if(f%2==0){
                ans+=f;
            }
            else{
                ans+=f-1;
                odd=true;
            }
        }
        return odd? ans+1 : ans;
    }
}