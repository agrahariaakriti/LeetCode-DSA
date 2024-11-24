// class MyLinkedList {
//     public Node head;
//     public Node tail;
//     public int size ;
//     public MyLinkedList() {
//         head=null;
//         tail=null;
//         size=0;
//     }
    
//     public int get(int index) {
//         if(index<0 && index>=size)
//         return -1;
//         if(index==0)
//         return head.data;
//         else
//         {
//             int count=0;
//             Node temp=head;
//             while(count<index)
//             {
//                 temp=temp.next;
//                 count++;
//             }
//             return temp.data;
//         }

//     }
    
//     public void addAtHead(int val) {
//         Node newNode=new Node(val);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//         }
//         newNode.next=head;
//         head=newNode;
//         size++;
//     }
    
//     public void addAtTail(int val) {
        
//         Node newNode=new Node(val);
//         if(head==null)
//         {
//             head=newNode;
//             tail=newNode;
//         }
//         else
//         {
//             tail.next=newNode;
//             tail=newNode;
//         }
//         size++;
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index<0 && index>size)
//         return;
//         if(index==0)
//         addAtHead(val);
//         // if(index==size-1)
//         // addAtTail(val);
//         Node newNode=new Node(val);
//         Node temp=head;
//         int count=0;
//         while(count<index)
//         {
//             temp=temp.next;
//             count++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//         // else
//         // temp.next=newNode;
//         size++;
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0 && index>=size)
//         return ;
//         Node temp=head;
//         int count=0;
//        for(int i=0;i<index && temp.next!=null;i++)
//        {
//         temp=temp.next;
//        }
//        if(temp.next!=null)
//         temp.next=temp.next.next;

//         size--;
//     }
// }
// class Node
// {
//     int data;
//     Node next;
//     Node(int data)
//     {
//         this.data=data;
//         next=null;
//     }
// } 

class MyLinkedList {
 class Node{
    int val ;
    Node next;
    Node(int val){
        this.val = val;
    }
 }
 int size ;
 Node dummynode;
    public MyLinkedList() {
        dummynode = new Node(-1);
        size=0;
    }
    
    public int get(int index) {
        if(index >= size){
            return -1;
        }
        Node currentnode = dummynode;
        for(int i = 0 ; i<=index; i++){
           currentnode  = currentnode.next;
        }
        return currentnode.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node (val);
        node.next = dummynode.next;
        dummynode.next = node;
        size++; 
    }
    
    public void addAtTail(int val) {
         Node node = new Node (val);
            Node currentnode = dummynode;
        for(int i = 0 ; i<size; i++){
           currentnode  = currentnode.next;
        } 
        currentnode.next = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)
        return ;
      Node node = new Node (val);
            Node currentnode = dummynode; 
             for(int i = 0 ; i<index; i++){
           currentnode  = currentnode.next;
        }   
        node.next = currentnode.next;
        currentnode.next = node; 
size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)
        return ;
     Node currentnode = dummynode; 
 for(int i = 0 ; i<index; i++){
           currentnode  = currentnode.next;
        }   
        currentnode.next = currentnode.next.next;
        size--;
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

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */