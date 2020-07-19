class Solution {
    public String addBinary(String a, String b) {
       StringBuffer sp = new StringBuffer("");
        if(a.length()==b.length())
        {
            int carry=0;
            for(int i=a.length()-1;i>=0;i--)
            {
                if(a.charAt(i)=='0' && b.charAt(i)=='0')
                {
                    if(carry==1)
                        sp.append("1");
                    else 
                        sp.append("0");
                    
                    carry=0;
                }
                else if(a.charAt(i)=='0' && b.charAt(i)=='1')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else if(a.charAt(i)=='1' && b.charAt(i)=='0')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else
                {
                    if(carry==1)
                    {
                        sp.append("1");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("0");
                        carry=1;
                    }
                }
            }
            if(carry==1)
                sp.append("1");
            
            return reverse(sp.toString());
        }
        else if(a.length()>b.length())
        {
            int carry=0;
            int j=b.length()-1;
            for(int i=a.length()-1;i>=a.length()-b.length();i--,j--)
            {
                if(a.charAt(i)=='0' && b.charAt(j)=='0')
                {
                    if(carry==1)
                        sp.append("1");
                    else 
                        sp.append("0");
                    
                    carry=0;
                }
                else if(a.charAt(i)=='0' && b.charAt(j)=='1')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else if(a.charAt(i)=='1' && b.charAt(j)=='0')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else
                {
                    if(carry==1)
                    {
                        sp.append("1");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("0");
                        carry=1;
                    }
                }
            }
            
            if(carry==0)
            {
                for(int i=a.length()-b.length()-1;i>=0;i--)
                    sp.append(a.charAt(i));
            }
            else
            {
                for(int i=a.length()-b.length()-1;i>=0;i--)
                {
                    if(a.charAt(i)=='0')
                    {
                        if(carry==1)
                        {
                            sp.append("1");
                            carry=0;
                        }
                        else
                            sp.append("0");
                    }
                    else if(a.charAt(i)=='1')
                    {
                        if(carry==1)
                        {
                            sp.append("0");
                            carry=1;
                        }
                        else
                            sp.append("1");
                    }  
                }
            }
            if(carry==1)
                sp.append("1");
            
            return reverse(sp.toString());
        }
        else
        {
             int carry=0;
            int j=a.length()-1;
            for(int i=b.length()-1;i>=b.length()-a.length();i--,j--)
            {
                if(b.charAt(i)=='0' && a.charAt(j)=='0')
                {
                    if(carry==1)
                        sp.append("1");
                    else 
                        sp.append("0");
                    
                    carry=0;
                }
                else if(b.charAt(i)=='0' && a.charAt(j)=='1')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else if(b.charAt(i)=='1' && a.charAt(j)=='0')
                {
                    if(carry==1)
                    {
                        sp.append("0");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("1");
                        carry=0;
                    }
                }
                else
                {
                    if(carry==1)
                    {
                        sp.append("1");
                        carry=1;
                    }
                    else 
                    {
                        sp.append("0");
                        carry=1;
                    }
                }
            }
            
            if(carry==0)
            {
                for(int i=b.length()-a.length()-1;i>=0;i--)
                    sp.append(b.charAt(i));
            }
            else
            {
                
                for(int i=b.length()-a.length()-1;i>=0;i--)
                {
                    if(b.charAt(i)=='0')
                    {
                        if(carry==1)
                        {
                            sp.append("1");
                            carry=0;
                        }
                        else
                            sp.append("0");
                    }
                    else if(b.charAt(i)=='1')
                    {
                        if(carry==1)
                        {
                            sp.append("0");
                            carry=1;
                        }
                        else
                            sp.append("1");
                    }  
                }
            }
            
            if(carry==1)
                sp.append("1");
            
            return reverse(sp.toString());
        }
    }
   private String reverse(String s)
   {
       StringBuffer sp = new StringBuffer("");
       for(int i=s.length()-1;i>=0;i--)
           sp.append(s.charAt(i));
       
       return sp.toString();
   }
}