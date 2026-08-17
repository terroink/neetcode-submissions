class Solution {
    public int reverseBits(int n) {
        int a=0;
       for(int i=0;i<32;i++)
        {
            int bit=n&1;
            a=a<<1;
            a=a|bit;
            n=n>>1;
        }
        return a;
    }
}
