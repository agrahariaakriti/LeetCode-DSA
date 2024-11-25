class MyLinkedList {

    public Node head;
    public Node tail;
    public int size;
    public MyLinkedList() {
        tail=null;
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index >= size)
        return -1;
        else
        {
            Node temp=head;
            int count=0;
            while(count<index)
            {
                temp=temp.next;
                count++;
            }
            return temp.data;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;}
        size=size+1;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);

        if(head==null)
        {
            head=tail=newNode;
        }
        else{
        tail.next=newNode;
        tail=newNode;}
        size=size+1;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode=new Node(val);
        if(index < 0 || index > size)
        return ;
        if(index==0)
        {addAtHead(val);return ;}
        if(index==size)
        {addAtTail(val);
        return;}
        else
        {
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            if(temp.next==null)
            {
                temp.next=newNode;
                tail=newNode;
            }
            else
            {
                newNode.next=temp.next;
                temp.next=newNode;
            }
            size=size+1;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(size==0)
        return;
        if(index < 0 || index >= size)
        return ;
        if(index==0){
        head=head.next;
        if(head==null)
        tail=null;
        }
        else
        {
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next==null)
            tail=temp;
        }
         size--;
    }
}
class Node
{
    int data;
    Node next;
    Node(int val) 
    {
        data=val;
        next=null;
    }
}




/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */