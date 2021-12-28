import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * This is a project that I worked on with a partner created the basis for in freshman year using python. 
 * 
 * I am now adapting it to be better and in java 
 * 
 * For simplicity: 
 * Sharps will be labeled as "#" example: A sharp would be "A#" 
 * Flats will be labeled as "b" example: B flat would be "Bb"
 * 
 * I plan to expand on this program in the future, making it more accessible for non music majors/minors 
 * 
 * As of right now, I adhere to this circle of fifths for the keys https://bit.ly/32AVoum
 * In the future, I plan to add enharmonics, but one thing at a time 
 * 
 */

public class MainMusic {
    	
    	// Important stuff 
    	final String[] sharpNotes = {"A", "A#", "B", "B#", "C", "D", "E", "F", "G"}; 
	final String[] flatNotes = {"A", "A#", "B", "B#", "C", "D", "E", "F", "G"}; 
	final String[] validKeySignatures = {}; 
	
	// User responses 
	
	
    public static void main(String[]args) { 
	// User responses 
	String begin = ""; 
	String chosenKey = ""; 
	int chosenNote = -1;
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Would you like to start?");
	begin = kb.next(); 
	
	if(begin.equalsIgnoreCase("yes")) { 
	    
	    System.out.println("Awesome. Lets begin.");
	    System.out.println();
	    System.out.println("Enter in a key and a scale tone (1-8)");
	    System.out.println("Key:");
	    chosenKey= kb.next(); 
	    System.out.println("Note:");
	    chosenNote = kb.nextInt();
	    System.out.println("Calculating...");
	    System.out.println("...");
	    System.out.println("...");
	    System.out.println((getNote(chosenKey, chosenNote)));
	 
	    
	    
	    // Testing key and getNote() 
	    
	} else { 
	    System.out.println("Goodbye");
	    System.exit(0);
	}	
	
    }
    
    /*
     * gets a specific note from a given key  
     */
    public static String getNote(String key, int note) { 
	
	// Error checking 
	if(!validKey(key) && (!validNote(note))) {
	    return "Try another key and number of the scale"; 
	}
	
	if(!validKey(key)) { 
	    return "Try another key"; 
	}
	
	if(!validNote(note)) { 
	    return "Try another scale tone"; 
	}
	
	
	
	
	
	
	return "Placeholder note";
	
    }
    
    /*
     * Returns true if the key passed in is in the array 
     */
    public static boolean arrayContains(String[] array, Object o) {
	for(int a = 0; a < array.length; a++) { 
	    if(array[a] == o) { 
		return true;
	    }
	}
	return false; 
    }
    
   
    /*
     * Returns true if the key passed in is valid 
     */
    public static boolean validKey(String key) { 
	String keys [] = {"C","G","D","A", "E", "B", "Cb","F#", "Gb", "Db", "C#", "Ab", "Eb", "Bb", "F"};
	// List<String> keyAList = new ArrayList<>(Arrays.asList(keys));
	// return keyAList.contains(key);
	return arrayContains(keys, key); 
    } // isValidKey bracket end 
    
    /*
     * Returns true if the note passed in is valid
     */
    public static boolean validNote(int note) {
	return !(note < 1 || note > 8); 
    }
    
    public void information() { 
	System.out.println("Hello! My name is Devon Boldt and this is a project I am working on" +
	"\n" + "This is a project that was conceived during my freshman year in CS 101 which I am now expanding on now" +
	"\n" + "This is currently a WIP that I am working on right now as sort of a side project, so please be patient" + 
	"\n" + "Feel free to email me ideas at boldtdevon@gmail.com, I will try to respond to any requests");
    }
    
    
} // Class ending bracket 

