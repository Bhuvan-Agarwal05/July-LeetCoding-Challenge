class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12)
        {
            double d =  ( minutes - (minutes/12.0) ) * 6;
            if(d>180.0)
                return 360.0 - d;
            else
                return d;
        }
        else
        {
            double d1 = Math.abs( minutes - (hour*5) - (minutes/12.0) ) * 6;
            if(d1>180.0)
                return 360.0 - d1;
            else
                return d1;
        }
    }
}