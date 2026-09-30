class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int i = digits.length;
        while(i>0)
        {
            if(digits[i-1] != 9)
            {
                digits[i-1]+=1;
                carry=0;
                break;
            }
            else
            {
                digits[i-1]=0;
                carry=1;
                i--;
            }
        }
        if(carry!=1)
        return digits;
        else
        {
           int[] digits2 = new int[digits.length + 1];
           digits2[0] = 1;
           return digits2;
        }
        
    }
} 