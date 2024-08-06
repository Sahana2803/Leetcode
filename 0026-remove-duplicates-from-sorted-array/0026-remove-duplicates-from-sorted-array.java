class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0;
        int i=0;
    //   for( i=0;i<nums.length;i++)
    //   {
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
                // nums[res]=nums[i];
                // res+=1;
                //return new int[]{nums[i]};
            }
        }
         return i+1;
      }
     // return new int[]{};  
    
    }
