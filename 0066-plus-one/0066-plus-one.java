class Solution { 
    public int[] plusOne(int[] digits) {
        int count=0;
        int res=0;
        for(int i=0;i<digits.length;i++)
        {
             count+=1;
        }
        for(int i=count-1;i>=0;i--)
        {
           //if(i==count-1)
          // {
             if(digits[i]<9)
             {
                digits[i]++;
                return digits;
             }
             digits[i]=0;
          // }
           
        }
       int[]newNumber=new int[count+1];
         newNumber[0]=1;
           return newNumber;
    }
}