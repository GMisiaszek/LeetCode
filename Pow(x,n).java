public class Solution {
    public double myPow(double x, int n) {
        int i=0;
        double result=x;
        if(n==0) return 1;
        if(x==1) return 1;
        if(x==-1&&n%2!=0) return -1;
        if(x==-1&&n%2==0) return 1;
        if(n>0) {for(i=0;i<n-1;i++){
            result=result*x;
            if(result==0) break;
        }
        }
        if(n<0){
            result=1/result;
            for(i=0;i<-n-1;i++){
            result=result*(1/x);
            if(result==0) break;
            
        }
        }
    return result;}
}