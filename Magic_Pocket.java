import java.util.Scanner;

public class Magic_Pocket {
    static int []a=new int[30];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(count(n,40));
    }
    //递归
    public static int count(int k,int sum){
        if(sum==0){
            return 1;
        }
        if(k<=0){
            return 0;
        }
        return count(k-1,sum-a[k])+count(k-1,sum);
    }
}
