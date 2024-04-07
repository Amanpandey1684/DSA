public class stack_linklist{
    Node top;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
            
        }
    }
    void push(int d){
        Node newNode=new Node(d);
        if(top==null)
        {
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    void pop(){
        if(top==null)
        {
            System.out.println("stack is underflow");
            return;
        }
        top=top.next;
        
    }
        
    void printList(){
        if(top==null)
        {
            System.out.println("stack is underflow");
            return;
        }
        Node last=top;
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last=last.next;
        }
    }

	public static void main(String[] args) {
	    stack_linklist list=new stack_linklist();
	    list.push(2);
	    list.push(3);
	    list.printList();
	    System.out.println();
	    list.pop();
	    list.printList();
	}
}
