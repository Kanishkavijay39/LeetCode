class MyLinkedList {
    private class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=this.prev=null;
        }
    }
    
    private Node head,tail;
    private int size;

    public MyLinkedList() {
        this.head=this.tail=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0 ||index>=size) return -1;
        Node curr=head;
        while(index!=0){
            index--;
            curr=curr.next;
        }
        return curr.val;
    }
    
    
    public void addAtHead(int val) {
        Node n=new Node(val);
        if(size==0){
            head=tail=n;
        }
        else{
            head.prev=n;
            n.next=head;
            head=n;
        }
        size++;
    }
  
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(size==0){
            head=tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size|| index<0) return;
        if(index==0) {addAtHead(val); return;}
        if(index==size){ addAtTail(val); return;}
        Node n=new Node(val);
        Node curr=head;
        while(index!=0){
            index--;
            curr=curr.next;
        }
        Node pnode=curr.prev;
        pnode.next=n;
        n.prev=pnode;
        n.next=curr;
        curr.prev=n;
        size++;
    }
    
    public void removeFirst(){
        if(size==0) return;
        if(size==1){
            head=tail=null;
            size=0;
        }
        else{
        head=head.next;
        head.prev=null;
        size--;
        }
    }
    public void removeLast(){
        if(size==0) return;
        if(size==1){
            head=tail=null;
            size=0;
        }
        else{
        tail=tail.prev;
        tail.next=null;
        size--;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size)  return;

        if(index==0) {
           removeFirst();
        }
        else if(index==size-1){
            removeLast();
        }
        else{
        Node curr=head;
        while(index>0){
            index--;
            curr=curr.next;
        }
        Node pnode=curr.prev,fnode=curr.next;
        pnode.next=fnode;
        fnode.prev=pnode;
        curr.next=curr.prev=null;
        size--;
        }
        

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