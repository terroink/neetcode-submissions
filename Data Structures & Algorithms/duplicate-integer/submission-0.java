class Solution {
    public boolean hasDuplicate(int[] nums) {
        int x= nums.length;
        
        int f=0;
        for(int i=0;i<x;i++)
            { 
                int k= nums[i];
                int c=0;
               for(int j=0;j<x;j++)
                { 
                 if(k==nums[j])
                 c++;
                 }
            if(c>1)
             {
             f=1;
             break;
             }
         }
            if(f==1)
            return true;
            else
            return false;
    }

            
        }
        
    