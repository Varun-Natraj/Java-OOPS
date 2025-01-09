import java.util.*;
class Node{
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}
public class Main {
    public static void display(Node headNode)
    {
        if(headNode == null)
        {
            System.out.println("null");
        }
        else
        {
            // Node temp = heaNode;
            // while(temp!=null)
            // {
            //     System.out.print(temp.data+"->");
            //     temp = temp.next;
            // }
            // System.out.print("null");
            System.out.print(headNode.data+"->");
            display(headNode.next);
        }
    }
    public static Node insertionBegin(Node headNode,int data)
    {
        Node temp = new Node(data);
        if(headNode==null)
        {
            headNode = temp;
        }
        else
        {
            temp.next = headNode;
            headNode = temp;
        }
        return headNode;
    }
    public static Node insertionEnd(Node headNode,int data)
    {
        Node temp = new Node(data);
        if(headNode==null)
        {
            headNode = temp;
        }
        else
        {
            Node temp1 = headNode;
            while(temp1.next != null)
            {
                temp1 = temp1.next;
            }
            temp1.next = temp;
        }
        return headNode;
    }
    public static Node insertionSpecificPos(Node headNode,int data,int pos)
    {
        Node temp = new Node(data);
        if(headNode==null) 
        {
            headNode = temp;
        }
        if(pos == 1)
        {
            headNode = insertionBegin(headNode, data);
            return headNode;
        }
        int count = 1;
        Node temp1 = headNode;
        while(temp1.next != null)
        {
            count++;
            if(count == pos)
            {
                Node temp2 = temp1.next;
                temp1.next = temp;
                temp.next = temp2;
                break;
            }
            temp1 = temp1.next;
        }
        if(temp1.next == null)
        {
            temp1.next = temp;
        }
        return headNode;
    }
    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            int val = sc.nextInt();
            head = insertionEnd(head, val);
            System.out.println();
        }
        head = insertionSpecificPos(head, 67, 3);
        display(head);
    }
}