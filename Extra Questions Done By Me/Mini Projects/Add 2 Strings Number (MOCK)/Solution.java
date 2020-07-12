class Solution {
    public String addStrings(String num1, String num2) {
        int sum = Integer.parseInt(num1.charAt(num1.length()-1)+"") + Integer.parseInt(num2.charAt(num2.length()-1)+"");
        
        StringBuffer sp = new StringBuffer("");
        sp.append(sum%10+"");
        int carry = sum/10;
        
        if(num1.length()==num2.length())
        {
            for(int i=num1.length()-2;i>=0;i--)
            {
                sum = Integer.parseInt(num1.charAt(i)+"") + Integer.parseInt(num2.charAt(i)+"") + carry;
                sp.append(sum%10+"");
                carry = sum/10;
            }
            if(carry!=0)
                sp.append(carry+"");
        }
        else if(num1.length()>num2.length())
        {
            int diff = num1.length() - num2.length();
            for(int i=num2.length()-2;i>=0;i--)
            {
                sum = Integer.parseInt(num1.charAt(i+diff)+"") + Integer.parseInt(num2.charAt(i)+"") + carry;
                sp.append(sum%10+"");
                carry = sum/10;
            }
            
            if(carry==0)
            {
                for(int i=diff-1;i>=0;i--)
                    sp.append(num1.charAt(i));
            }
            else
            {
                for(int i=diff-1;i>=0;i--)
                {
                    sum = Integer.parseInt(num1.charAt(i)+"") + carry;
                    sp.append(sum%10+"");
                    carry = sum/10;
                }
                if(carry!=0)
                    sp.append(carry+"");
            }
        }
        else
        {
            int diff = num2.length() - num1.length();
            for(int i=num1.length()-2;i>=0;i--)
            {
                sum = Integer.parseInt(num1.charAt(i)+"") + Integer.parseInt(num2.charAt(i+diff)+"") + carry;
                sp.append(sum%10+"");
                carry = sum/10;
            }
            
            if(carry==0)
            {
                for(int i=diff-1;i>=0;i--)
                    sp.append(num2.charAt(i));
            }
            else
            {
                for(int i=diff-1;i>=0;i--)
                {
                    sum = Integer.parseInt(num2.charAt(i)+"") + carry;
                    sp.append(sum%10+"");
                    carry = sum/10;
                }
                if(carry!=0)
                    sp.append(carry+"");
            }
        }
        
        
        StringBuffer output = new StringBuffer("");
        for(int i=sp.length()-1;i>=0;i--)
        {
            output.append(sp.charAt(i));
        }
        
        return output.toString();
    }
}