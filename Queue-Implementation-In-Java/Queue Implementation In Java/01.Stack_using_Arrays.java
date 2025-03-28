public class 01.Stack_using_Arrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            size=n;
            rear=-1;
        }
        public static boolean iEmpty(){
            return rear=-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return ;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                system.out.println("stack is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is full");
                return -1;
            }
            return arr[0];
        }
        public static void main(String args[]){
            Queue q=new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            while(!q.isEmpty()){
                system.out.println(q.peek());
            }
        }
    }
    
}
