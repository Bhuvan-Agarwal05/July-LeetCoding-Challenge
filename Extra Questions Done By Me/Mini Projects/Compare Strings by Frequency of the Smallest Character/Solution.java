class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] countOfWords = new int[words.length];
        int[] output = new int[queries.length];
        
        int k=0;
        for(String s:words)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            
            int count=1;
            for(int i=1;i<c.length;i++)
            {
                if(c[0]==c[i])
                    count++;
                else
                    break;
            }
            
            countOfWords[k] = count;
            k++;
        }
        
        Arrays.sort(countOfWords);
        k=0;
        
        for(String s:queries)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            int count=1;
            for(int i=1;i<ch.length;i++)
            {
                if(ch[0]==ch[i])
                    count++;
                else
                    break;
            }
            
            output[k] = search(countOfWords,count);
            k++;
        }
        
        return output;
    }
    
    public int search(int[] countOfWords,int count){
        int low = 0;
        int high = countOfWords.length-1;
        
        int mid=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(countOfWords[mid]<=count)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return countOfWords.length - low;
    }
}