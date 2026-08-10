class Solution {
    public int mySqrt(int x) {
    //    long lo=0, hi=x;
    //     while(lo<=hi){
    //         long mid= lo+(hi-lo)/2;
    //         if(mid*mid==x) return (int) mid; 
    //         else if(mid*mid>x) hi=mid-1;
    //         else lo=mid+1;
    //     }
    //     return (int)hi; 

     int lo=1, hi=x;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(mid==x/mid) return (int) mid; //(mid*mid==x)=>(mid==x/mid)
            else if(mid>x/mid) hi=mid-1;
            else lo=mid+1;
        }
        return hi;
    }
}