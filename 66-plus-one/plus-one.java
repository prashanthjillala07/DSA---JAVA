class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int i=digits.length-1;
        while(i>=0)
        {
            if(digits[i]!=9)
            {
                digits[i]+=1;
                carry=0;
                break;
            }
            digits[i]=0;
            carry=1;
            i--;
        }
        if(carry==0)
        {
            return digits;
        }
        int [] digits2 = new int[digits.length+1];
        digits2[0]=1;
        System.arraycopy(digits, 0, digits2, 1,digits.length);
        return digits2;
    }
} 