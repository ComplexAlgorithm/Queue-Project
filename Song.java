package arrayBasedPackage;


public class Song extends Object {
	//instance variables
	private String name;
	private String artist;
	
	//one constructor
	public Song(String newName, String newArtist) {
		super();
		name = newName;
		artist = newArtist;
	}
	
	public String toString() {
		return "Name: " + name + " Artist: " + artist;
	}
	
	//non-static methods
	//none, what that means is that Song is what we call immutable class
	//which means that once an object of this class is created none of its 
	//instance variables can be changed
}
