public class 03.Queue_using_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static node head=null;
        static node tail=null;
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }
        public static int add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return ;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty())
{
    system.out.println("emptuy");
    return -1;
}       
int front=head.data;
if(tail==head){
    tail=head=null;
} 
else{
    head=head.next;
}}



    }

    
}
