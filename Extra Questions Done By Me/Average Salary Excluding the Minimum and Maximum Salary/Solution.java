class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        
        int totalSum = salary[0];
        for(int i=1;i<salary.length;i++)
        {
            totalSum += salary[i];
            if(salary[i]>max)
                max = salary[i];
            if(salary[i]<min)
                min = salary[i];
        }
    
        totalSum -= (min+max);
        return ((double)totalSum/(salary.length-2));
    }
}