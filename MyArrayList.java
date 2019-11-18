import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
      private int size=0;
    private int []array;

    public MyArrayList(){
        array=new int[10];
    }
    public MyArrayList(int[] array){
        this.array=new int[array.length];
        for(int i=0;i<=array.length-1;i++){
            this.array[i]=array[i];
        }
        size=array.length;
    }
    //插入
    public void insert(int index,int element){
        if(index<0||index>size){
            System.out.println("error input");
            return;
        }ensureCapacity();
        for(int i=size-1;i>index-1;i--){
            array[i+1]=array[i];
        }
        array[index-1]=element;
        size++;
    }
    //删除
    public void delete(int index){
        if(index<0||index>size-1){
            System.out.println("error input");
            return;
        }
        for(int i=index-1;i<size-1;i++){
            array[i]=array[i+1];
        }
        size--;
    }
    //扩容
    //1申请新的空间
    //2搬东西
    //3通知 新地址
    public void ensureCapacity(){
        if(size>array.length){
            return;
        }
        int oldCapacity=array.length;
        int newCapacity=oldCapacity+oldCapacity/2;
        int newArray[]=new int[newCapacity];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        array=newArray;
    }
    //打印
    public String print(){
        return Arrays.toString(Arrays.copyOf(array,size));
    }

    public static void main(String[] args) {
        int []array={2,1,4,6,9};
        MyArrayList arrayList=new MyArrayList(array);
        System.out.println(arrayList.print());
        arrayList.insert(3,10);
        System.out.println(arrayList.print());
        arrayList.delete(5);
        System.out.println(arrayList.print());
    }
}
