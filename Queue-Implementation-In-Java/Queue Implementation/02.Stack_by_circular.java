public class 02.Stack_by_circular{
     static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean iEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size=front;
        }
        public static void add(int data){
           if(isFull()){
            System.out.println("queue is full");
            return ;
           }
           rear=(rear+1)%size;
           arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                system.out.println("stack is empty");
                return -1;
            }
            int res=arr[front];
            if(res==front){
                rear=front=-1;
            }
            else{
            front=(front+1)%size;
            }
            return res;
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