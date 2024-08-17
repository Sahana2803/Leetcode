class Solution {
    public String largestNumber(int[] nums)
     {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            arr[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < arr.length - 1; i++)
         {
            for (int j = i + 1; j < arr.length; j++)
             {
                String s1 = arr[i] + arr[j];
                String s2 = arr[j] + arr[i];
                if (s1.compareTo(s2) < 0) 
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr[0].equals("0")) 
        {
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for (int i=0;i<arr.length;i++)
        {
            largestNumber.append(arr[i]);
        }

        return largestNumber.toString();
    }
}
