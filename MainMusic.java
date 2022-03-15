import java.util.Scanner;

public class MainMusic {

  // Important stuff
  final String[] sharpNotes = {"A", "A#", "B", "B#", "C", "D", "E", "F", "G"};
  final String[] flatNotes = {"A", "A#", "B", "B#", "C", "D", "E", "F", "G"};

  public static void main(String[] args) {

    // User responses
    String validKeySignatures[] =
        {"C", "G", "D", "A", "E", "B", "Cb", "F#", "Gb", "Db", "C#", "Ab", "Eb", "Bb", "F"};
    String begin = "";
    String chosenKey = "";
    String moreInfo = "";
    String checkMajor = "";
    int chosenNote = -1;
    boolean major = true;
    Scanner kb = new Scanner(System.in);

    System.out.println("Would you like to start?");
    System.out.println("( YES / NO )");
    begin = kb.next();

    while (begin.equalsIgnoreCase("yes")) {

      System.out.println("Awesome. Lets begin." + "\n");
      System.out.println("Would you like to have (Major) or (Minor) ");
      checkMajor = kb.next();

      if (checkMajor.equalsIgnoreCase("Major")) {
        major = true;
      }

      if (major) {
        System.out.println("Enter in a key and a scale tone (1-8)");
        System.out.println("Key:");
        chosenKey = kb.next();
        if (arrayContains(validKeySignatures, chosenKey)) {

          // while(!arrayContains(validKeySignatures, chosenKey)) {
          System.out.println("Please chose another key");
          chosenKey = kb.next();
          // }

        }

        System.out.println("Note:");
        chosenNote = kb.nextInt();
        if (chosenNote < 1 || chosenNote > 8) {

          // while (chosenNote < 1 || chosenNote > 8){
          System.out.println("Please choose another note");
          chosenNote = kb.nextInt();
          // }

        }

        System.out.println("Calculating..." + "\n" + "..." + "\n" + "..." + "\n" + "...");
        // System.out.println((getNote(chosenKey, chosenNote)));
        System.out
            .println("You chose the" + printScaleTone(chosenNote) + "of " + chosenKey + " major!");
      }

      // MINOR stuff
      else {

        System.out.println("Enter in a key and a scale tone (1-8)");
        System.out.println("Key:");
        chosenKey = kb.next();
        if (arrayContains(validKeySignatures, chosenKey)) {

          // while(!arrayContains(validKeySignatures, chosenKey)) {
          System.out.println("Please chose another key");
          chosenKey = kb.next();
          // }

          System.out.println("Note:");
          chosenNote = kb.nextInt();
          if (chosenNote < 1 || chosenNote > 8) {

            // while (chosenNote < 1 || chosenNote > 8){
            System.out.println("Please choose another note");
            chosenNote = kb.nextInt();
            // }

          }

          System.out.println("Calculating..." + "\n" + "..." + "\n" + "	..." + "\n" + "...");
          // System.out.println((getNote(chosenKey, chosenNote)));
          System.out.println(
              "You chose the" + printScaleTone(chosenNote) + "of " + chosenKey + " major!");

        }
      }

      System.out.println("Would you like to know more information about the note? ( YES / NO )");
      moreInfo = kb.next();
      if (moreInfo.equalsIgnoreCase("YES")) {
        // ADD more info
        System.out.println(information());
      }

      System.out.println("\n");
      // Repeat seqence
      System.out.println("Would you like to go again? ( YES / NO )");
      begin = kb.next();

    }

    System.out.println("Goodbye");
    System.exit(0);
  }

  /*
   * gets a specific note from a given MINOR key
   */
  @SuppressWarnings({"unused", "null"})
  public static String getMinorNote(String key, int note) {

    Scanner kb = new Scanner(System.in);
    boolean natural = false;
    boolean harmonic = false;
    boolean melodic = false;
    String formedMinorScale[] = null;
    String minorType = " ";
    String allNotes[] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#",
        "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",};

    // Error checking
    if (!validKey(key) && (!validNote(note))) {
      return "Try another key and number of the scale";
    }

    if (!validKey(key)) {
      return "Try another key";
    }

    else if (!validNote(note)) {
      return "Try another scale tone";
    }

    if (findFirstInstance(allNotes, key) == -1) {
      return "Something wrong happened";
    }

    System.out.println("What minor would you like?" + "\n" + "(NATURAL) (HARMONIC) (MELODIC)");
    minorType = kb.next();

    // Choosing the type of minor
    if (minorType.equalsIgnoreCase("natural")) {
      natural = true;
    } else if (minorType.equalsIgnoreCase("harmonic")) {
      harmonic = true;
    } else {
      melodic = true;
    }

    // getting to the key in allNotes
    for (int i = 0; i < findFirstInstance(allNotes, key); i++) {
      allNotes[i] = null;
    }

    int a = -1;
    while (allNotes[a] == null) {
      a++;
    }

    if (natural) {
      formedMinorScale[0] = allNotes[a];
      formedMinorScale[1] = allNotes[a];
      formedMinorScale[2] = allNotes[a];
      formedMinorScale[3] = allNotes[a];
      formedMinorScale[4] = allNotes[a];
      formedMinorScale[5] = allNotes[a];
      formedMinorScale[6] = allNotes[a];
      formedMinorScale[7] = allNotes[a];
    }

    if (harmonic) {
      formedMinorScale[0] = allNotes[a];
      formedMinorScale[1] = allNotes[a];
      formedMinorScale[2] = allNotes[a];
      formedMinorScale[3] = allNotes[a];
      formedMinorScale[4] = allNotes[a];
      formedMinorScale[5] = allNotes[a];
      formedMinorScale[6] = allNotes[a];
      formedMinorScale[7] = allNotes[a];
    }

    if (melodic) {
      formedMinorScale[0] = allNotes[a];
      formedMinorScale[1] = allNotes[a];
      formedMinorScale[2] = allNotes[a];
      formedMinorScale[3] = allNotes[a];
      formedMinorScale[4] = allNotes[a];
      formedMinorScale[5] = allNotes[a];
      formedMinorScale[6] = allNotes[a];
      formedMinorScale[7] = allNotes[a];
    }



    return "This needs to be finished";
  }

  /*
   * gets a specific note from a given MAJOR key
   */
  @SuppressWarnings("null")
  public static String getMajorNote(String key, int note) {

    String allNotes[] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#",
        "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",};

    // formedKey An easy way to get the entire scale
    String formedMajorScale[] = null;

    // Error checking
    if (!validKey(key) && (!validNote(note))) {
      return "Try another key and number of the scale";
    }

    if (!validKey(key)) {
      return "Try another key";
    }

    else if (!validNote(note)) {
      return "Try another scale tone";
    }

    if (findFirstInstance(allNotes, key) == -1) {
      return "Something wrong happened";
    }

    else {

      // Setting the first note to the passed in note
      formedMajorScale[0] = key;

      // getting to the key in allNotes
      for (int i = 0; i < findFirstInstance(allNotes, key); i++) {
        allNotes[i] = null;
      }

      int a = -1;
      while (allNotes[a] == null) {
        a++;
      }

      // I know there is probably a better way to do this, but that's a problem for future me
      a = a + 2;
      formedMajorScale[1] = allNotes[a];
      a = a + 2;
      formedMajorScale[2] = allNotes[a];
      a = a + 1;
      formedMajorScale[3] = allNotes[a];
      a = a + 2;
      formedMajorScale[4] = allNotes[a];
      a = a + 2;
      formedMajorScale[5] = allNotes[a];
      a = a + 2;
      formedMajorScale[6] = allNotes[a];
      a = a + 1;
      formedMajorScale[7] = allNotes[a];

    }

    return formedMajorScale[note - 1];

  }
  
  /*
   * Creates a triad based on a given 8-note scale, the type of triad ( major, minor, augumented, diminished ), as well as the triad tone ( I, ii, iii, iv, V )
   */
  @SuppressWarnings("null")
public static String[] triadCreator(String[] scale, String typeTriad, String triadTone) { 
      String[]triad = null; 

      // Important triad stuff to work on 
      // if(!typeTriad.equalsIgnoreCase("major") || !typeTriad.equalsIgnoreCase("minor") || !typeTriad.equalsIgnoreCase("augmented") || !typeTriad.equalsIgnoreCase("diminished")) {
	    //   return
      // }
      
      switch(typeTriad) { 
        case "major": 
            switch(triadTone){ 
              case "I": 
                triad[0] = scale[0];
                triad[1] = scale[2]; 
                triad[2] = scale[4]; 
                return triad; 
              case "ii":
                triad[0] = scale[1];
                triad[1] = scale[3]; 
                triad[2] = scale[5]; 
                return triad; 
              case "iii":
                triad[0] = scale[2];
                triad[1] = scale[4]; 
                triad[2] = scale[6]; 
                return triad; 
              case "iv":
                triad[0] = scale[3];
                triad[1] = scale[5]; 
                triad[2] = scale[7]; 
                return triad;   
              case "v":
                triad[0] = scale[4];
                triad[1] = scale[6]; 
                triad[2] = scale[8]; 
                return triad; 
              default: 
                return triad; 
            }
        case "minor": 
        case "augmented":
        case "dimished":
        default: 
        break;       
      }
      
      return triad;          
  }
  
  /*
   * Clears an array 
   */
  public static String[] voidArray(String[] array) { 
      for(int i = 0; i < array.length; i++) { 
	      array[i] = null; 
      }
      return array; 
  }


  /*
   * Helper method to work with the various scale tones to provide more information
   */
  public static String printScaleTone(int number) {
    // Tonic, Supertonic, Mediant, Subdominant, Dominant, Submediant, Leading Note
    switch (number) {
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
  public static int findFirstInstance(String[] array, String s) {

    if (!arrayContains(array, s)) {
      return -1;
    } else {
      for (int a = 0; a < array.length; a++) {
        if (array[a] == s) {
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

    for (int a = 0; a < array.length; a++) {
      if (array[a] == o) {
        arrayContainsBool = true;
      }
    }
    return arrayContainsBool;
  }

  /*
   * Returns true if the key passed in is valid
   */
  public static boolean validKey(String key) {
    String keys[] =
        {"C", "G", "D", "A", "E", "B", "Cb", "F#", "Gb", "Db", "C#", "Ab", "Eb", "Bb", "F"};
    return arrayContains(keys, key);
  } // isValidKey bracket end


  /*
   * Returns true if the note passed in is valid
   */
  public static boolean validNote(int note) {
    return !(note < 1 || note > 8);
  } 

  public static String information() {
    return ("I need to add something here");
  }

}// Class ending bracket
