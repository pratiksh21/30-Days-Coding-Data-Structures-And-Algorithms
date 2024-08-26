https://leetcode.com/problems/two-sum/description/


#code 
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int [] arr = new int[2];


       for(int i=0;i<nums.length;i++){
        if(mpp.containsKey(target -nums[i])){
          arr[0]=mpp.get(target -nums[i]);
          arr[1]=i;
        }

        mpp.put(nums[i],i);
       }


       return arr;
    }


  time and space complexity: both are Big O(n)
  
}
