package arrayBasedPackage;

public class ArrayBasedQueue<T> implements QueueInterface<T> {
	//instance variables
	private int front;
	private int rear;
	private int numberOfItems;  
	private T[] queue;  //reference to an array of type T
	
	//default constructor
	public ArrayBasedQueue() {
		super();
		front = 0;
		rear = 0;
		numberOfItems = 0;
		queue = (T[])new Object[5];
	}
	
	//overloaded constructor
	public ArrayBasedQueue(int size) {
		super();
		front = 0;
		rear = 0;
		numberOfItems = 0;
		if(size > 0) {
			queue = (T[])new Object[size];
		}
		else {
			queue = (T[])new Object[5];
		}
	}
	
	@Override
	public void enqueue(T item) throws QueueFullException {
		if(numberOfItems < queue.length) {
			queue[rear] = item;  //places the item at the rear of the queue
			numberOfItems++;
			if(rear == queue.length-1) { //rear is on the last element in the array
				rear = 0; //reset rear to the first element in the array
			}
			else {
				rear++;
			}
			
		}
		else {
			throw new QueueFullException("Enqueue attempted on a full queue!");
		}

	}

	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(numberOfItems == 0) {
			throw new QueueEmptyException("Dequeue attempted on an empty queue!");
		}
		else {
			T frontItem = queue[front]; //saves the item at the front before it is removed
			queue[front] = null; //removes the item at the front of the queue
			numberOfItems--;
			//front = (front+1) % queue.length; 
			if(front == queue.length-1) { //front is on the last element in the array
				front = 0;  //reset front to the first element in the array 
			}
			else {
				front++; 
			}
			return frontItem;
		}
	}

	@Override
	public String look() {
		// TODO Auto-generated method stub
		String frontItem = "";
		if(numberOfItems == 0) {
			frontItem = "Queue is Empty";
		}
		else {
			frontItem = queue[front].toString();
		}
		return frontItem;
	}

}
