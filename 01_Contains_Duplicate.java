https://leetcode.com/problems/contains-duplicate/description/


#code
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int ele : nums){
            if(hs.contains(ele)){
                return true;
            }

            hs.add(ele);
        }


        return false;
    }
}
