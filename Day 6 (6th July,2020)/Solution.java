class Solution
{
    public int[] plusOne(int[] digits) 
    {
        int carry = 0;
        int flag=0;
        LinkedList<Integer> list = new LinkedList<>();
        
        String s = (digits[digits.length-1]+1)+"";
        if(s.length()==1)
        {
            list.add(0,digits[digits.length-1]+1);
            for(int i=digits.length-2;i>=0;i--)
                list.add(0,digits[i]);
        }
        else
        {
            carry = Integer.parseInt(s.charAt(0)+"");
            list.add(0,Integer.parseInt(s.charAt(1)+""));
            for(int i=digits.length-2;i>=0;i--)
            {
                if(flag==1)
                    list.add(0,digits[i]);
                else
                {
                    s = Integer.toString(digits[i]+carry);
                    if(s.length()==1)
                    {
                        list.add(0,digits[i]+carry);
                        carry=0;
                        flag=1;
                    }
                    else if(s.length()==2)
                    {
                        carry = Integer.parseInt(s.charAt(0)+"");
                        list.add(0,Integer.parseInt(s.charAt(1)+""));
                    }
                }
            }
            if(carry!=0)
                list.add(0,carry);
        }
        
        int[] output = new int[list.size()];
        for(int i=0;i<list.size();i++)
            output[i] = list.get(i);
        
        return output;
    }
}