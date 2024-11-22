public class QueueImpUsingStacks {
    int count=0;
    int n=5;
    int[] s1=new int[n];
    int[] s2=new int[n];
    int top1=-1;
    int top2=-1;

    public void push1(int data){
        top1++;
        s1[top1]=data;

    }
    public void push2(int data){
        top2++;
        s2[top2]=data;

    }
    public int pop1(){
        return s1[top1--];
    }
    public int pop2(){
        return s2[top2--];
    }

    public void enqueue(int x){
        push1(x);
        count++;


    }
    public void dequeue(){
        if(top1==-1 && top2==-1){
            System.out.println("stack is empty");

        }
        else{
            for (int i = 0; i < count ; i++) {
                int a= pop1();
                push2(a);
            }
            int b =pop2();
            System.out.println("dequed element is "+ b);

        }
        count--;
        for (int i = 0; i <count ; i++) {
            int a1=pop2();
            push1(a1);
        }
    }
    public void display(){
        System.out.println("the elements in s1");
        for (int i = 0; i <=top1; i++) {
            System.out.print(s1[i]+" ");

        }
    }

    public static void main(String[] args) {
        QueueImpUsingStacks obj =new QueueImpUsingStacks();
        obj.enqueue(5);
        obj.enqueue(2);
        obj.enqueue(-1);
        obj.dequeue();
        obj.enqueue(7);
        obj.display();
    }
} 