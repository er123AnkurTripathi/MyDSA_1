package linkedList;

public class MySinglyLinkedList {

	Integer data;
	MySinglyLinkedList next;
	
	
	public void add(int a) {
		MySinglyLinkedList tail= this;
		if(this.data==null)
		{
			this.data = a;
		}
		else {
			while(tail.next!=null) {
				tail=tail.next;
			}
		MySinglyLinkedList newNode = this.createANode(a);
		tail.next = newNode;
		}
	}
	
	/*
	 * public int get(int index) {
	 * 
	 * if(this.size()-1<index) { throw new
	 * IndexOutOfBoundsException("Index cannot be greater than size"); }
	 * 
	 * }
	 */
	
	public Integer findMiddle()
	{ 
		MySinglyLinkedList head= this;
		
		MySinglyLinkedList slow=head;
		MySinglyLinkedList fast=head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	   
	}
	
	public int size() {
		int size=0;
		if(this.data!=null)
		{size=1;
		MySinglyLinkedList next = this.next;
		while(next!=null) {
			size++;
			next = next.next;
		}
	    }
		return size;
		}
	
	
	public MySinglyLinkedList createANode(int a) {
		MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
		mySinglyLinkedList.data = a;
		mySinglyLinkedList.next = null;
		return mySinglyLinkedList;
	}
}
