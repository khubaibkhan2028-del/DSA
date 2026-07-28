class Solution {
    public int maxArea(int[] height) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int h : height){
            list.add(h);
        }
        //  int maxWater = 0;
        //  for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         int ht = Math.min(list.get(i), list.get(j));
        //         int width = j-i;
        //         int currWater = ht*width;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        //  }
        //  return maxWater;

        // two pointer Approach
        int maxWater = 0;
        int lp=0, rp=list.size()-1;
        while(lp<rp){
            // calculate water area
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater,currWater);

            // update pointer
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
       return maxWater; 
    }
}