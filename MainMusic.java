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
	

	
    public static void main(String[]args) { 
	// User responses 
	String validKeySignatures [] = {"C","G","D","A", "E", "B", "Cb","F#", "Gb", "Db", "C#", "Ab", "Eb", "Bb", "F"};
	String begin = ""; 
	String chosenKey = ""; 
	String moreInfo = "";
	int chosenNote = -1;
	@SuppressWarnings("resource")
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Would you like to start?");
	System.out.println("( YES / NO )");
	begin = kb.next(); 
	
	while (begin.equalsIgnoreCase("yes")) { 
	    
	    System.out.println("Awesome. Lets begin." + "\n");
	    System.out.println("Enter in a key and a scale tone (1-8)");
	    System.out.println("Key:");
	    chosenKey= kb.next(); 
	    if(arrayContains(validKeySignatures, chosenKey)) { 
		
		// while(!arrayContains(validKeySignatures, chosenKey)) {
		    System.out.println("Please chose another key");
		    chosenKey = kb.next();
		// }
		
	    }
	    
	    System.out.println("Note:");
	    chosenNote = kb.nextInt();
	    if(chosenNote < 1 || chosenNote > 8) {
		
		// while (chosenNote < 1 || chosenNote > 8){
			System.out.println("Please choose another note");
			chosenNote = kb.nextInt(); 
		// }
		
	    }
	    
	    System.out.println("Calculating..." + "\n" + "..." + "\n" + "..." + "\n" + "...");
	    // System.out.println((getNote(chosenKey, chosenNote)));
	    System.out.println("You chose the" + printScaleTone(chosenNote) + "of " + chosenKey +" major!");
	    
	    System.out.println("Would you like to know more information about the note? ( YES / NO )");
	    moreInfo = kb.next(); 
	    if(moreInfo.equalsIgnoreCase("YES")) { 
		
	    }

	    
	    
	    System.out.println("\n");
	    // Repeat seqence 
	    System.out.println("Would you like to go again? ( YES / NO )");
	    begin = kb.next();
	    	    
	} 
	
	// { 
	    System.out.println("Goodbye");
	    System.exit(0);
	// }	
	
    }
    
    /*
     * gets a specific note from a given key  
     * As of right now, this only handles major keys 
     */
    @SuppressWarnings("null")
    public static String getNote(String key, int note) { 
	
	String allNotes[] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G","G#", 
			     "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G","G#",};
	
	// formedKey An easy way to get the entire scale 
	String formedKey[] = null; 
	
	// Error checking 
	if(!validKey(key) && (!validNote(note))) {
	    return "Try another key and number of the scale"; 
	}
	
	if(!validKey(key)) { 
	    return "Try another key"; 
	} 
	
	else if(!validNote(note)) { 
	    return "Try another scale tone"; 
	}
	
	if(findFirstInstance(allNotes, key) == -1) { 
	    return "Something wrong happened"; 
	}
	
	else { 
	    
	    // Setting the first note to the passed in note 
	    formedKey[0] = key; 

		// getting to the key in allNotes 
		for(int i = 0; i < findFirstInstance(allNotes, key); i++){ 
			allNotes[i] = null;
		}

		int a = -1; 
		while(allNotes[a] == null){ 
			a++; 
		}

		// I know there is probably a better way to do this, but that's a problem for future me 
		a = a + 2; 
		formedKey[1] = allNotes[a];
		a = a + 2;  	
		formedKey[2] = allNotes[a]; 
		a = a + 1; 
		formedKey[3] = allNotes[a]; 
		a = a + 2;
		formedKey[4] = allNotes[a]; 
		a = a + 2; 
		formedKey[5] = allNotes[a];
		a = a + 2; 
		formedKey[6] = allNotes[a]; 
		a = a + 1;
		formedKey[7] = allNotes[a]; 

	}
	
	return formedKey[note-1];
	
    }
    
    
    /*
     * Helper method to work with the various scale tones to provide more information 
     */
    public static String printScaleTone(int number) { 
	// Tonic, Supertonic, Mediant, Subdominant, Dominant,  Submediant, Leading Note
	switch(number) { 
	case 1: 
		return " tonic ";	
	case 2: 
		return " supertonic "; 		
	case 3:
		return " mediant ";
	case 4: 
		return " subdominant ";	
	case 5: 
	    	return " dominant ";
	case 6: 
		return " submediant ";		
	case 7:
		return " leading tone "; 		
	default: 
		return " Error loading note ";  
	}
	
    }
    
    /*
     * Finds the first instance of the object and returns its index in the array 
     */
    public static int findFirstInstance(String[]array, Object o) {
	
	if(!arrayContains(array, o)) { 
	    return -1; 
	} 
	else { 
	    for(int a = 0; a < array.length; a++) { 
		if(array[a] == o) { 
		    return a; 
		}
	    }
	}
	
	return -1;
	
    }
    
    /*
     * Returns true if the key passed in is in the array 
     */
    public static boolean arrayContains(String[] array, Object o) {
	boolean arrayContainsBool = false; 

	for(int a = 0; a < array.length; a++) { 
	    if(array[a] == o) { 
		arrayContainsBool = true;
	    } 
	}
	return arrayContainsBool; 
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

