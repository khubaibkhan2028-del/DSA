class Solution {
    public boolean hasAllCodes(String s, int k) {
      int requiredCount = 1 << k; 
        if (s.length() - k + 1 < requiredCount) {
            return false;
        }       
        Set<Integer> uniqueCodes = new HashSet<>();
        int currentHash = 0;
        int mask = requiredCount - 1;        
        for (int i = 0; i < s.length(); i++) {
            currentHash = ((currentHash << 1) & mask) | (s.charAt(i) - '0');           
            if (i >= k - 1) {
                uniqueCodes.add(currentHash);
                if (uniqueCodes.size() == requiredCount) {
                    return true;
                }
            }
        }
        return false;
    }
}