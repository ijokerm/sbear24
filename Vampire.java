public class Vampire {
    /*
    把四位数拆成四个数字 1260 1-2-6-0，然后组合成两个2位数计算他们的乘积，相等则是吸血鬼数字
     */
    public int [] array(int num){
        int [] a=new int[4];
        int i=0;
        while(num!=0){
            a[i++]=num%10;
            num=num/10;
        }
        return a;
    }
    public boolean equal(int num,int [] a){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j){
                    continue;
                }else{
                    if(6-i-j==5){//i,j=0 or 1
                        if((a[i]*10+a[j])*(a[3]*10+a[2])==num||(a[i]+a[j]*10)*(a[3]*10+a[2])==num){
                            return true;
                        }
                    }
                    else if(6-i-j==4){//i,j=0 or 2
                        if((a[i]*10+a[j])*(a[3]*10+a[1])==num||(a[i]+a[j]*10)*(a[3]*10+a[1])==num){
                            return true;
                        }
                    }
                   else if(6-i-j==3&&(i==3||j==3)){//i,j=0 or 3
                        if((a[i]*10+a[j])*(a[2]*10+a[1])==num||(a[i]+a[j]*10)*(a[2]*10+a[1])==num){
                            return true;
                        }
                    }
                   else if(6-i-j==3&&(i==1||j==1)){//i,j=1 or 2
                        if((a[i]*10+a[j])*(a[3]*10+a[0])==num||(a[i]+a[j]*10)*(a[3]*10+a[0])==num){
                            return true;
                        }
                    }
                   else if(6-i-j==2){//i,j=1 or 3
                        if((a[i]*10+a[j])*(a[2]*10+a[0])==num||(a[i]+a[j]*10)*(a[2]*10+a[0])==num){
                            return true;
                        }
                    }
                    else if(6-i-j==1){//i,j=2 or 3
                        if((a[i]*10+a[j])*(a[1]*10+a[0])==num||(a[i]+a[j]*10)*(a[1]*10+a[0])==num){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sum=0;
        Vampire v=new Vampire();
        for(int i=1001;(i<=9999);i++){
            if(v.equal(i,v.array(i))){
               System.out.println(i);
                sum++;
                            }
        }
        System.out.println(sum);

    }
}
