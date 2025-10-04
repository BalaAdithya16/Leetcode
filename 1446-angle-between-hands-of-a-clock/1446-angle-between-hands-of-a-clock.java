class Solution {
    public double angleClock(int hour, int minutes) {
        double h=((hour)+((double)minutes)/60)*30;
        double m=minutes*6;
        double ans=Math.abs(h-m);
        if(ans>180){
            ans=360-ans;
        }
        return ans;
    }
}