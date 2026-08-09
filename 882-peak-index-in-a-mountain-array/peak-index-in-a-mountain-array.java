class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int n = arr.length;
        // int lo = 0, hi = n - 1;
        // while (lo < hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     //  increasing side
        //     if (arr[mid] < arr[mid + 1]) {
        //         lo = mid + 1;
        //     }
        //     //  decreasing side
        //     else {
        //         hi = mid;
        //     }
        // }

        // return lo;


        int n = arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(mid>0 && mid<n-1 && arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]) return mid;
            else if(mid>0 && mid<n-1 && arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]) lo=mid+1;
            else hi=mid;
        }
        return -1;
    }
}