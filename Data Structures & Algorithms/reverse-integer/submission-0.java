class Solution {
    public int reverse(int x) {
        int d=0,r=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(x!=0)
        {
            d=x%10;
            if(r>max/10||(r==max/10 && d>max%10))
            return 0;
            if(r<min/10||(r==min/10 && d<min%10))
            return 0;
            r=r*10+d;
            x=x/10;
        }
        return r;
    }
}
