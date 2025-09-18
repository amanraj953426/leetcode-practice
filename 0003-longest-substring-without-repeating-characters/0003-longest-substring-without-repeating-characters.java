class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;

        Map<Character, Integer> mySet = new HashMap<>(); //Initialize HashMap
        for(int right=0; right<s.length(); right++){
            char currentChar = s.charAt(right);
            if (mySet.containsKey(currentChar)){
                left = Math.max(left, mySet.get(currentChar)+1);
            }
            mySet.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;
}
}