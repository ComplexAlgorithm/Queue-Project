package nodeBasedPackage;
/**
 * Node class allows objects to be created that can be connected
 * or linked to each other to create a chain of nodes which 
 * can be used as a replacement for an array
 * 
 *
 * @param <T> T is a type parameter that will receive a type argument
 */
public class Node<T> extends Object {
	//instance variables
	private T data;
	private Node<T> link; //reference to a Node object
	
	/**
	 * Constructor takes an argument which will be value stored in the Node
	 * and node is not linked to any other node
	 * @param newData is the value stored in the Node
	 */
	public Node(T newData) {
		super();
		data = newData;
		link = null;
	}
	
	/**
	 * setData changes the value stored in the Node
	 * @param newData is the value that will be stored in the Node
	 */
	public void setData(T newData) {
		data = newData;
	}
	
	/**
	 * Returns the value stored in the Node
	 * @return value stored in the Node
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * Connects the node object to the otherNode
	 * @param otherNode is the object that will be linked to the Node that is method is called on
	 */
	public void setLink(Node<T> otherNode) {
		this.link = otherNode;
	}
	
	/**
	 * Returns the object that this Node is linked to
	 * @return the Node object that this Node is linked to
	 */
	public Node<T> getLink() {
		return link;
	}
	
}