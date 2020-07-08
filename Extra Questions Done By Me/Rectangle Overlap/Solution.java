class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.max(rec1[0], rec2[0]) < Math.min(rec1[2], rec2[2]) && Math.max(rec1[1], rec2[1]) < Math.min(rec1[3], rec2[3]);
        //  max(x1,p1) < min(x2,p2)  &&  max(y1,q1) < min(y2,q2) 
    }
}