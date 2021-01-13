package DS_package;
//=======================*{{ Node }}*=======================*{{ Node }}*=======================//
class Node{
	public int data;
	public Node next;
	
	public Node(int d) {
		data=d;
	}
	
	public void displayLink() {
		System.out.println(data);
	}
}
//=======================*{{ LinkedList }}*=======================*{{ LinkedList }}*=======================//
class LinkedList{
	public Node first=null;
	/* you create a new node without passing arguments and it is possible.
	 * we don't write it in constructor because 
	 * it should be appear to all methods
	 */
	//-------------*{ insertFirst }*-------------*{ insertFirst }*-------------//
	public void insertFirst(int d) {
		Node newNode =new Node(d);
		newNode.next=first;
		first=newNode;
	}
	//------------*{ deleteFirst }*-------------*{ deleteFirst }*-------------//
	public Node deleteFirst() {
		Node temp=first;
		first=first.next;
		return temp;
	}
	//-------------*{ displayList }*-------------*{ displayList }*-------------//
	public void displayList() {
		Node current=first;
		while(current!=null) {
			current.displayLink();//first--->last
			current=current.next;
		}
	}
	//-------------*{ findItem }*-------------*{ findItem }*-------------//
	public Node findItem(int key) {
		Node current=first;
		while(current.data!=key) {
			if(current.next==null)
				return null;
			else
				current=current.next;
		}
		return current;
	}
	//-------------*{ deleteItem }*-------------*{ deleteItem }*-------------//
	public Node deleteItem(int value) {
		Node current=first;
		Node previous=first;
		while(current.data!=value) {
			if(current.next==null)
				return null;
			else {
				previous=current;
				current=current.next;
			}
		}
		if(current==first)
			first=first.next;
		else {
			previous.next=current.next;
		}
			
		return current;
	}
	
}
//=======================*{{ FirstLastList }}*=======================*{{ FirstLastList }}*=======================//
class FirstLastList{
	Node first=null;
	Node last=null;
	//-------------*{ isEmpty }*-------------*{ isEmpty }*-------------//
	public boolean isEmpty() {
		return first==null;
	}
	//-------------*{ insertFirst }*-------------*{ insertFirst }*-------------//
	public void insertFirst(int data) {
		Node newNode=new Node(data);
		if(isEmpty())
			last=newNode;
		newNode.next=first;
		first=newNode;
	}
	//-------------*{ insertLast }*-------------*{ insertLast }*-------------//
	public void insertLast(int data) {
		Node newNode=new Node(data);
		if(isEmpty())
			first=newNode;
		else
			last.next=newNode;
		last=newNode;
	}
	//-------------*{ deleteFirst }*-------------*{ deleteFirst }*-------------//
	public int deleteFirst() {
		int temp=first.data;
		if(first.next==null)
			last=null;
		first=first.next;
		return temp;
	}
	//-------------*{ display }*-------------*{ display }*-------------//
	public void display() {
		Node temp=first;
		while(temp!=null) {
			//System.out.println(temp.data);
			temp.displayLink();
			temp=temp.next;
		}
	}
	
}
//=======================*{{ LinkedListApp }}*=======================*{{ LinkedListApp }}*=======================//
class LinkedListApp{
	public static void main(String args[]) {
		FirstLastList obj=new FirstLastList();
		obj.insertFirst(20);
		obj.insertLast(30);
		obj.insertLast(40);
		obj.insertLast(50);
		obj.insertFirst(10);
		obj.display();
	}
}




