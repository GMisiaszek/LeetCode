public class Solution {
    public String toWord(int a){
        if(a==1) return "One ";
        if(a==2) return "Two ";
        if(a==3) return "Three ";
        if(a==4) return "Four ";
        if(a==5) return "Five ";
        if(a==6) return "Six ";
        if(a==7) return "Seven ";
        if(a==8) return "Eight ";
        if(a==9) return "Nine ";
        if(a==10) return "Ten ";
        if(a==11) return "Eleven ";
        if(a==12) return "Twelve ";
        if(a==13) return "Thirteen ";
        if(a==14) return "Fourteen ";
        if(a==15) return "Fifteen ";
        if(a==16) return "Sixteen ";
        if(a==17) return "Seventeen ";
        if(a==18) return "Eighteen ";
        if(a==19) return "Nineteen ";
        if(a==20) return "Twenty ";
        if(a==30) return "Thirty ";
        if(a==40) return "Forty ";
        if(a==50) return "Fifty ";
        if(a==60) return "Sixty ";
        if(a==70) return "Seventy ";
        if(a==80) return "Eighty ";
        if(a==90) return "Ninety ";
        return "";
    }
     public String hundredsBuilder(int a){
        int result;
        String build="";
        result=a/100;
        if(result!=0) build=toWord(result)+"Hundred"+" ";
        a-=result*100;
        result=a/10;
        if(result>=2) {build=build+toWord(result*10);
                       a-=result*10;
                      build=build+toWord(a);}
        if(result<2) build=build+toWord(a);
        return build;
    }
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        int result;
        String build="";
        result=num/1000000000;
        num-=result*1000000000;
        if(result!=0){
            build=toWord(result)+"Billion"+" ";
            
        }
        result=num/1000000;
        if(result!=0) build+=hundredsBuilder(result)+"Million"+" ";
        num-=result*1000000;
        result=num/1000;
        if(result!=0) build+=hundredsBuilder(result)+"Thousand"+" ";
        num-=result*1000;
        build+=hundredsBuilder(num);
        build=build.substring(0, build.length()-1);
        
        return build;
    }
}