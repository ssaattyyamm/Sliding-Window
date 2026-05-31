1class Solution {
2    public int totalFruit(int[] arr) {
3        int n = arr.length;
4
5        HashMap<Integer,Integer> map = new HashMap<>();
6
7        int i=0;
8        int j=0;
9
10        int ans =0;
11
12        while(j < n){
13            map.put(arr[j] , map.getOrDefault(arr[j] ,0)+ 1);
14
15            while(map.size() > 2){
16                map.put(arr[i] , map.get(arr[i]) -1);
17
18                if(map.get(arr[i])== 0) map.remove(arr[i]);
19
20                i++;
21            }
22
23            ans = Math.max(ans , j-i+1);
24            j++;
25        }
26
27        return ans;
28    }
29}