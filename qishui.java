import java.util.Scanner;
public class qishui{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(sc.hasNext()){
            result = sc.nextInt();
            bottle(result);
        }
        sc.close();
    }

    private static void bottle(int num2) {
        int num=0,num1=0,bnum=0,bnum1=0;
        num = num2;

        bnum1 = num/3;
        num = num%3;
        bnum = bnum1 + bnum;
        num1 = num + bnum1;

        while(num1>=3){
            num = num1%3;
            bnum1 = num1/3;
            bnum = bnum1 + bnum;
            num1 = num + bnum1;
        }
        if(num1==2)
            bnum++;
        System.out.println(bnum);

    }
}
