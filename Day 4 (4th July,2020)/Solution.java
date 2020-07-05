class Solution {
    public int nthUglyNumber(int n) {
        if(n<=6)
            return n;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        
        int p1,p2,p3;
        p1=0;
        p2=0;
        p3=0;   // Three Pointers for 2 , 3 and 5
        
        while(list.size()<n)
        {
            int t1 = list.get(p1)*2;
            int t2 = list.get(p2)*3;
            int t3 = list.get(p3)*5;
            int minNum = Math.min(t1,Math.min(t2,t3));
            
            list.add(minNum);
            if(minNum==t1)
                p1++;
            if(minNum==t2)
                p2++;
            if(minNum==t3)
                p3++;
        }
        
        return list.get(list.size()-1);
        
    }
}