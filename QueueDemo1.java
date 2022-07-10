package arrayBasedPackage;

import nodeBasedPackage.NodeBasedQueue;

public class QueueDemo1 {
	public static void main(String[] args) {
		QueueInterface<String> waitList = new NodeBasedQueue<String>();
		try {
			System.out.println(waitList.look());
			waitList.enqueue("Jill");
			waitList.enqueue("Jack");
			waitList.enqueue("Frank");
			waitList.enqueue("Bill");
			//waitList.enqueue("Emily");
			System.out.println(waitList.look());
			String front = waitList.dequeue();
			System.out.println(front);
			System.out.println(waitList.look());
			waitList.enqueue("Emily");
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
		}
		catch(QueueFullException | QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
		//catch(QueueEmptyException e) {
		//	System.out.println(e.getMessage());
		//}
		//int x = 4;
		//int y = 4;
		//if(x >= 5 | y < 6) {
		//	System.out.println("Inside the if");
		//}
	}

}
