class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class LinkedList
{   Node head;
        
    public void append(int data){
        if (head==null){
            head=new Node(data);
        }
        else
        {   Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=new Node(data);
        }
    }
    public int size(){
        Node cur=head;
        int length=0;
        while(cur!=null){
            length++;
            cur=cur.next;
        }
        return length;
    }
    public void display(){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
        }
        public void remove(int index){
        if (index==0){
            head=head.next;
        }
        else {
            int count=1;
            Node cur=head;
            while (count<index && count<this.size()){
                cur=cur.next;
                count++;
            }
            cur.next=cur.next.next;
        }
}
}
    class Main{
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.append(2);
		l.append(6);
		l.append(32);
		l.append(23);
		l.display();
		l.remove(1);
		l.display();
		System.out.print(l.size());
	}
}
