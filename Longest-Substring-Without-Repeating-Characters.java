1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4
5        int i=0;
6        int j=0;
7
8        HashMap<Character,Integer> map = new HashMap<>();
9
10        int ans = 0;
11
12        while(j < n){
13            char ch = s.charAt(j);
14
15            //shrinking condn : 
16            if(map.containsKey(ch) && map.get(ch) >= i){
17                i = map.get(ch) + 1;
18            }
19
20            map.put(ch , j);
21            ans = Math.max(ans , j - i + 1);
22            j++;
23        }
24
25        return ans;
26    }
27}