class Solution {
    public int[] twoSum(int[] num, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<num.length; i++){
            int sec = target - num[i];

            if(hm.containsKey(sec)){
                return new int[] {hm.get(sec),i};
            }
            hm.put(num[i],i);
        }
        return new int[] {-1, -1};
    }
}