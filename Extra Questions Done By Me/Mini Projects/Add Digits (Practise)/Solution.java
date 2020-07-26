class Solution {
    public int addDigits(int num) {
        if(num<=9)
            return num;
        else
        {
            int digit=0;
            int sum = 0;
            int temp = num;
            while(temp!=0)
            {
                sum += (temp%10);
                temp /= 10;
            }
            
            digit = (int)Math.floor(Math.log10(sum)+1);
            if(digit==1)
                return sum;
            else
                return addDigits(sum);
        }
    }
}