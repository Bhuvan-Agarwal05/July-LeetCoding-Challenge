class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        
        int j=0;
        for(int i=1;j<target.length && i<=n;i++)
        {
            if(target[j] == i )
            {
                list.add("Push");
                j++;
            }
            else
            {
                // When Data is Not Present then do PUSH & POP.
                list.add("Push");
                list.add("Pop");
            }
        }
        
        return list;
    }
}