import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree
{
        Node root;
        Tree()
        {
            this.root=null;
        }

        public void insert(int data)
        {
            this.root=insert_in_bst(this.root,data);
        }
        public Node insert_in_bst(Node root,int data)
        {
            if(root==null)
            {
                return  new Node(data);
            } else if (data< root.data) {
                root.left=insert_in_bst(root.left,data);
            }
            else {
                root.right=insert_in_bst(root.right,data);
            }
            return root;
        }

        public void inorder()
        {
            System.out.println("In Order Is :");
            inOrder(this.root);
        }
        public static void inOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inOrder(root.left);
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
        public void levelOrder()
        {
            System.out.println("Level Order Is :");
            level_order(this.root);
        }
        public void postOrder()
        {
            System.out.println("Post Order Is :");
            post_order(this.root);
        }
        public void post_order(Node root)
        {
            if(root==null)
            {
                return;
            }
            post_order(root.left);
            post_order(root.right);
            System.out.printf("%d ",root.data);
        }
    public void preOrder()
    {
        System.out.println("Pre Order Is :");
        pre_order(this.root);
    }
    public void pre_order(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.printf("%d ",root.data);
        pre_order(root.left);
        pre_order(root.right);
    }
        public void level_order(Node root)
        {
            Node temp=root;
            Queue<Node>q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty())
            {
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
                Node res=q.peek();
                System.out.printf("%d ",res.data);
                q.poll();
                temp=q.peek();
            }

        }

}
class Main
{
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.inorder();
        System.out.println();
        tree.levelOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.preOrder();
    }
}
