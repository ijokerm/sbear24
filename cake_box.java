import java.util.Scanner;

public class cake_box {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int result=0;
        while(R>0&&C>0){
            if(R%4==0||C%4==0){
                result=R*C/2;
            }else if(R%2==0&&C%2==0){
                result=(R*C/4+1)*2;
            }else{
                result=R*C/2+1;
            }
            System.out.println(result);
        }
       
    }
}
