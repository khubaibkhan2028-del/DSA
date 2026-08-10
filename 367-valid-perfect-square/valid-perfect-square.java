class Solution {
    public boolean isPerfectSquare(int num) {
        // for(int i = 1; i <= num; i++) {
        //     if(i * i == num)
        //         return true;

        //     if(i * i > num)
        //         break;
        // }

        // return false;

        // int lo=1, hi=num;
        // while(lo<=hi){
        //     int mid= lo+(hi-lo)/2;
        //     if(mid*mid==num) return true;
        //     else if(mid*mid>num) hi=mid-1;
        //     else lo=mid+1;
        // }
        // return false;

        int lo=1, hi=num;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            long square = (long)mid*mid;
            if(square==num) return true;
            else if(square>num) hi=mid-1;
            else lo=mid+1;

        }
        return false;
    }
}