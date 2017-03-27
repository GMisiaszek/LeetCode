public class Solution {
    public String intToRoman(int num){
        int count;
        int i;
        int a=num;
        String number="";
        count=a/1000;
        a-=(count*1000);
    if(count>=0&&count<=3){
        for(i=0;i<count;i++){
            
            number+="M";
        }
    }
    count=a/100;
    if(count>=0&&count<=3){
        for(i=0;i<count;i++){
            
            number+="C";
        }
    }
    if(count==4){
        
        number+="CD";
    }
    if(count==5){
        
        number+="D";
    }
    if(count>=6&&count<=8){
        
        number+="D";
        for(i=0;i<(-5+count);i++){
           
            number+="C";
        }
    }
    if(count==9){
        
        number+="CM";
    }
a-=(count*100);
    count=a/10;
    if(count>=0&&count<=3){
        for(i=0;i<count;i++){
            
            number+="X";
        }
    }
    if(count==4){
       
        number+="XL";
    }
    if(count==5){
        
        number+="L";
        
    }
    if(count>=6&&count<=8){
       
        number+="L";
        for(i=0;i<(-5+count);i++){
           
            number+="X";
        }
    }
    if(count==9){
        
        number+="XC";
    }
    a-=(count*10);
    count=a;
     if(count>=0&&count<=3){
        for(i=0;i<count;i++){
            
            number+="I";
        }
    }
    if(count==4){
       
        number+="IV";
    }
    if(count==5){
      
        number+="V";
        
    }
    if(count>=6&&count<=8){
      
        number+="V";
        for(i=0;i<(-5+count);i++){
           
            number+="I";
        }
    }
    if(count==9){
       
        number+="IX";
    }
    return number;
    
    }
        
    
}