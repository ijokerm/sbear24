public class nixu {
    public static void main(String[] args) {
        int [] A={1,2,3,4,5,6,7,0};
        int count=Count(A,A.length);
        System.out.println(count);
    }
    public static int Count(int[] A, int n) {
        // write code here
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[j]>A[i]){
                    result++;
                }
            }
        }
        return result;
    }
}
