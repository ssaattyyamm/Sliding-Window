1class Solution {
2    public int characterReplacement(String s, int k) {
3        // just find the shrinking condn :
4        // total replacable character : k
5        // total char = j - i + 1
6        // distnict char = toal - max_freq 
7
8
9        // shrinking condn : dist char > k 
10
11        int n = s.length();
12
13        int i = 0;
14        int j = 0;
15
16        int max = 0;
17
18        int res = 0;
19
20        HashMap<Character,Integer>  map = new HashMap<>();
21
22        while(j < n){
23            char ch = s.charAt(j);
24
25            map.put(ch,map.getOrDefault(ch,0)+1);
26
27            max = Math.max(max , map.get(ch));
28
29            if((j-i+1) - max > k){
30                char c = s.charAt(i);
31                
32                map.put(c, map.get(c) - 1);
33
34                if(map.get(c) == 0){
35                    map.remove(c);
36                }
37
38                i++;
39            }
40            res = Math.max(res, j-i+1);
41            j++;
42        }
43        return res;
44    }
45}