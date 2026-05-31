1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int n = nums.length;
4
5        int ones = 0;
6
7        int ans = 0;
8
9        int i=0;
10        int j=0;
11
12        while(j < n){
13            if(nums[j] == 1){
14                ones ++;
15            }
16
17            if((j-i+1) - ones > k){
18                if(nums[i] == 1) ones--;
19                i++;
20            }
21            ans = Math.max(ans , j-i+1);
22            j++;
23        }
24        return ans;
25    }
26}