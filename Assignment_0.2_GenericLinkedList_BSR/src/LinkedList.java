
/**
 * This class is a linkedlist
 * @author brentreynolds
 *
 * @version 9/8/2022 Fall 2022
 */
public class LinkedList<T> {
	
	// Instance variables
	Node<T> head; // Initial node in the list
	int length;   // Length of the list
	Node <T>tail; // last node of the list
	
	// Constructors
	
	/**
	 * No argument constructor initializes head, length, and tail
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	} // end constructor
	
	/**
	 * @return returns true if the list is empty
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/**
	 * @return the head of the list
	 */
	public Node getList()
	{
		return head;
	}
	
	/**
	 * @param aNode the value of aNode as sent into this method
	 */
	public void addNode(Node <T>aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Brent Reynolds");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData('B');
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}
}
