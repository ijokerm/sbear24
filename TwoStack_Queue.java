import java.util.Stack;

public class TwoStack_Queue {
    Stack<Integer>stack1=new Stack<Integer>();
    Stack<Integer>stack2=new Stack<Integer>();
    //队列数据压入
       public void push(Integer element){
           stack1.push(element);
       }
    //数据弹出
       public Integer pop(){
           if(stack2.size()<=0){//第二个栈为空
               while(stack1.size()>0){
                   stack2.push(stack1.pop());
               }
           }
           if(stack2.isEmpty()){
               try{
                   throw new Exception("queue is empty");
               }catch(Exception e){

               }
           }
           Integer head=stack2.pop();
           return head;
       }

    public static void main(String[] args) {
        TwoStack_Queue sq=new TwoStack_Queue();
        sq.push(1);
        sq.push(2);
        sq.push(1);
        sq.push(3);
        System.out.println(sq.pop());
        System.out.println(sq.pop());

        sq.push(8);
 //       System.out.println(sq.pop());

    }
}
