class Solution {
    public int longestConsecutive(int[] nums) {
        int l=0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums)
        set.add(x);
        for(int c:set)
        {
            if(!set.contains(c-1))
            {
                int start=c;
                int count=1;
            
            while(set.contains(start+1))
            {
                count++;
                start++;
            }
            l=Math.max(l,count);
        }
        }
        return l;
        
    }
}
