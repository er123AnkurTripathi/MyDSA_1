package linkedList;

import java.util.LinkedList;
import java.util.List;

public class MiddleElementInOnePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Integer> singlyLinkedList = new LinkedList<Integer>();
		 * singlyLinkedList.add(1); singlyLinkedList.add(12); singlyLinkedList.add(123);
		 * singlyLinkedList.add(111); singlyLinkedList.add(32); int middle =
		 * singlyLinkedList.size()/2;
		 * System.out.println("middle element ="+singlyLinkedList.get(middle));
		 */
		
		MySinglyLinkedList list = new MySinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.findMiddle());
	}

}
