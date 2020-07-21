class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles < numExchange)
            return numBottles;
        else if(numBottles==numExchange)
            return numBottles+1;
        else
        {
            int count = numBottles;
            int temp = 0;
            
            while(numBottles >= numExchange)
            {
                temp =  numBottles/numExchange;
                count += temp;
                numBottles = temp + numBottles%numExchange;
            }
            
            return count;
        }
    }
}