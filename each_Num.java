import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class each_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  M=sc.next();
        sc.close();
        int[] count=new int[20];
        for(int i=0;i<M.length();i++){
            char c=M.charAt(i);
            count[c-'0']++;
        }
        for(int j=0;j<count.length;j++){
            if(count[j]!=0){
                System.out.println(j+":"+count[j]);
            }
        }
    }



}
