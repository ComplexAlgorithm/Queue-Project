package nodeBasedPackage;

import arrayBasedPackage.QueueEmptyException;
public class QueueDemo3 {
	public static void main(String[] args) {
		NodeBasedQueue<String> playList = new NodeBasedQueue<String>();
		System.out.println(playList.look());
		playList.enqueue("Limelight");
		playList.enqueue("My Back Pages");
		playList.enqueue("Silent Lucidity");
		
		System.out.println(playList.look());
		
		try {
			System.out.println(playList.dequeue());
			System.out.println(playList.look());
			System.out.println(playList.dequeue());
			System.out.println(playList.look());
			System.out.println(playList.dequeue());
			System.out.println(playList.look());
		}
		catch(QueueEmptyException e) {
			System.out.println(e.getMessage());
		}

	}

}