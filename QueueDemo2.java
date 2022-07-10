package arrayBasedPackage;

import nodeBasedPackage.NodeBasedQueue;
import nodeBasedPackage.UnboundedQueueInterface;
import java.util.Scanner;
public class QueueDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		QueueInterface<Song> playList = new NodeBasedQueue<Song>();
		int option;
		
		do {
			System.out.println("Press 1 to add a song to the playList");
			System.out.println("Press 2 to remove a song from the playList");
			System.out.println("Press 3 to look at the song that is currently playing");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); // go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the song being added to the playlist?");
				String name = keyboard.nextLine();
				
				System.out.println("Which artist wrote this song?");
				String artist = keyboard.nextLine();
				
				Song currentSong = new Song(name,artist);
				try {
					playList.enqueue(currentSong);
				}
				catch(QueueFullException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 2) {
				try {
					Song front = playList.dequeue();
					System.out.println("Song that was removed: " + front.toString());
				}
				catch(QueueEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 3) {
				System.out.println("Current Song: " + playList.look());
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);

	}

}
