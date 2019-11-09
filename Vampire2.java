import java.util.Arrays;

public class Vampire2 {
    public static void main(String[] args) {
     String[] str1=null,str2;
     int sum=0;
     int count=0;
     for(int i=10;i<100;i++){
         for(int j=i+1;j<100;j++){
             int val=i*j;
             if(val<1000||val>9999){
                 continue;
             }
             count++;
             str1=String.valueOf(val).split("");
             str2=(String.valueOf(i)+String.valueOf(j)).split("");
             Arrays.sort(str1);
             Arrays.sort(str2);
             if(Arrays.equals(str1,str2)){
                 sum++;
                 System.out.println("第"+sum+"组"+i+"*"+j+"="+val);
             }
         }
     }

    }
}
