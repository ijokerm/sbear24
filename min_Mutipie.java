import java.util.Scanner;

public class min_Mutipie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int m=mutipie(A,B);
        int n=(A*B)/m;
        System.out.println(n);
    }
    public static int mutipie(int a,int b){
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        while(b!=0){
            if(a==b){
                return a;
            }else{
                //a>b;
                int k=a%b;
                a=b;
                b=k;
            }
        }
        return a;
    }
}
