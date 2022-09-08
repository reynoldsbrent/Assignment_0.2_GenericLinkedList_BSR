
/**
 * This class contains the constructors, getters, and setters for the nodes
 * @author brentreynolds
 *
 * @version 9/8/2022 Fall 2022
 */
public class Node<T> {
	// Instance variable
	
	T data; // Generic data type so that this linked list can be used for any data types
	Node<T> nextNode; // Instance of the generic Node class
	
	// Constructors
	
	/**
	 * The no argument constructor sets nextNode to null
	 */
	public Node()
	{
		nextNode=null;
		//data=0;
	}// end constructor
	
	// Accessors and mutators
	
	/**
	 * @param data the value of data as sent into this method 
	 */
	public void setData(T data) {
		this.data=data;
	} // end setData
	
	/**
	 * @return the current value of this node
	 */
	public Node getNode() {
		return this;
	} // end getNode
	
	
	/**
	 * @param nextNode the value of nextNode as sent into this method
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
}
