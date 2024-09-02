package linkedList;

class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data=data;
		this.next=null;
	}
}
public class IsSinglyLinkedListCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next= new ListNode(3);
		head.next.next.next = head;
		System.out.println(isCircular(head));
	}
	
	public static boolean isCircular(ListNode head) {
		boolean isCycle=false;
		/*
		 * ListNode nextNode = head.next; if(nextNode != null) {
		 * while(nextNode.next==null || nextNode.next!=head) { nextNode = nextNode.next;
		 * } if(nextNode.next==head) isCycle=true; } return isCycle;
		 */
		
		ListNode slow=head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				isCycle=true;
				break;
			}
		}
		return isCycle;
		}

}
