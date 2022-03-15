public class MusicHelpfulMethods {
    String allNotes[] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#",
	        "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",};
    
    public static void main(String[]args) { 
    
    }
    
    /*
     * Method that finds the first appearance to an element in a given array 
     * 
     * @param o The object to be searching for 
     * @param array The array to be searched 
     * @return The index of the element, else -1 
     */
    public int findFirstElement(Object o, String[] allNotes2) { 
	for(int i = 0; i < allNotes2.length; i++) { 
	    if(o == allNotes2[i]) { 
		return i; 
	    }
	}
	return -1;
    }
    
    /**
     * Creates Triads given a String
     * @param startingNote The starting Note
     * @return A created Triad
     */
    public String[] printTriad(String startingNote) { 
	
	String createdTriad[] = new String[2];
	int firstNote = findFirstElement(startingNote, allNotes); 
	
	createdTriad[0] = allNotes[firstNote];
	createdTriad[1] = allNotes[firstNote + 2];
	createdTriad[1] = allNotes[firstNote + 4];
	return createdTriad; 
    }
    
    
    @SuppressWarnings("null") // I was told to put this in
    public String[] minorScaleAscending(String type, String startingNote) { 
	
	String[] eString = null; 
	String[] mScale = null; 
	int firstNote = findFirstElement(startingNote, allNotes); 
	
	switch(type.toLowerCase()) { 
	case "natural": 
	    mScale[0] = allNotes[firstNote];
	    mScale[1] = allNotes[firstNote + 2]; 
	    mScale[2] = allNotes[firstNote + 1]; 
	    mScale[3] = allNotes[firstNote + 2]; 
	    mScale[4] = allNotes[firstNote + 2]; 
	    mScale[5] = allNotes[firstNote + 1]; 
	    mScale[6] = allNotes[firstNote + 2];
	    mScale[7] = allNotes[firstNote + 2]; 
	    return mScale;
	    
	case "harmonic":
	    mScale[0] = allNotes[firstNote];
	    mScale[1] = allNotes[firstNote + 2]; 
	    mScale[2] = allNotes[firstNote + 1]; 
	    mScale[3] = allNotes[firstNote + 2]; 
	    mScale[4] = allNotes[firstNote + 2]; 
	    mScale[5] = allNotes[firstNote + 1]; 
	    mScale[6] = allNotes[firstNote + 3];
	    mScale[7] = allNotes[firstNote + 1]; 
	    return mScale;
	case "melodic":
	    mScale[0] = allNotes[firstNote];
	    mScale[1] = allNotes[firstNote + 2]; 
	    mScale[2] = allNotes[firstNote + 1]; 
	    mScale[3] = allNotes[firstNote + 2]; 
	    mScale[4] = allNotes[firstNote + 2]; 
	    mScale[5] = allNotes[firstNote + 2]; 
	    mScale[6] = allNotes[firstNote + 2];
	    mScale[7] = allNotes[firstNote + 1]; 
	    return mScale;
	    
	default:
	    return eString;
	} 
    }
    
    /*
     * Returns true if the note passed in is valid
     */
    public static boolean validNote(int note) {
      return !(note < 1 || note > 8);
    }

    /*
     * Information
     */
    public static String information() {
      return ("I need to add something here");
    }
    
    /**
     * Creates a pentatonic scale based on a string 
     * @param s The note passed in 
     * @return
     */
    public String[] pentatonic(String s) {
	
	return allNotes; 
    }
    
    
    
    
}
