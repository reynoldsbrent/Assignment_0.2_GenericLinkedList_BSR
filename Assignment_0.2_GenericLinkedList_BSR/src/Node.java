
public class Node<T> {
	T data;
	Node<T> nextNode;
	public Node()
	{
		nextNode=null;
		//data=0;
	}
	public void setData(T data) {
		this.data=data;
	}
	public Node getNode() {
		return this;
	}
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
}
