class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to char array, sort it, and convert back to string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = String.valueOf(charArray);
            
            // If the key doesn't exist, create a new list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            
            // Add the original string to the corresponding list
            map.get(sortedKey).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}