import random

Notes = ["A","A#","B","C","C#","D","D#","E","F","F#","G","G#"]

MajorScale = [ 2, 2, 1, 2, 2, 2, 1]
MajorChords = [ 2, 1, 1, 2, 2, 1, 0]

MinorScale = [ 2, 1, 2, 2, 1, 2, 2]
MinorChords = [ 1, 0, 2, 1, 1, 2, 2]

MajorPentatonicScale = [ 2, 2, 3, 2, 2]


MinorPentatonicScale = [ 3, 2, 2, 3, 2]


def chooseScale():
    print "------------------------------"
    print "------------------------------"
    print "------------------------------"
    print "------------------------------"
    print(Notes)
    #User inputs their choice of key and scale
    print("What key would you like the scale to be?")
    Key = raw_input()
    print("Major | Minor | Major Pentatonic | Minor Pentatonic")
    print "Please note, only Major and Minor will create a chord progression"
    Scalechoice = raw_input()
    createScale(Key, Scalechoice)

def createScale(key, scale):
    userScale = []
    keyIndex = Notes.index(key)
    i = 0
    #Checks the user's intended scale against known scales
    #Goes through the spacing (Whole and Half-Steps) of each scale to form the user's intended scale
    #Appends selected notes from the chromatic scale list Notes to the list "userScale"
    if scale == "Major":
        while i < len(MajorScale):
            userScale.append(Notes[keyIndex])
            keyIndex = keyIndex + MajorScale[i]
            i = i + 1
            if keyIndex >= len(Notes):
                keyIndex = keyIndex - len(Notes)
        print key + ' ' + scale
        print userScale
        createChordProgression(userScale)
    if scale == "Minor":
        while i < len(MinorScale):
            userScale.append(Notes[keyIndex])
            keyIndex = keyIndex + MinorScale[i]
            i = i + 1
            if keyIndex >= len(Notes):
                keyIndex = keyIndex - len(Notes)
        print key + ' ' + scale
        print userScale
        createChordProgression(userScale)
    if scale == "Major Pentatonic":
        while i < len(MajorPentatonicScale):
            userScale.append(Notes[keyIndex])
            keyIndex = keyIndex + MajorPentatonicScale[i]
            i = i + 1
            if keyIndex >= len(Notes):
                keyIndex = keyIndex - len(Notes)
        print key + ' ' + scale
        print userScale
    if scale == "Minor Pentatonic":
        while i < len(MinorPentatonicScale):
            userScale.append(Notes[keyIndex])
            keyIndex = keyIndex + MinorPentatonicScale[i]
            i = i + 1
            if keyIndex >= len(Notes):
                keyIndex = keyIndex - len(Notes)
        print key + ' ' + scale
        print userScale
    print "------------------------------"
    print "------------------------------"
    print "------------------------------"
    print "------------------------------"

def fillChord(userScale):
    #Creates a triad of a chord from the scale provided
    #Chooses random index for root note and forms a triad based on notes a whole step apart in the scale
    chord = []
    firstNote = userScale.index(random.choice(userScale))
    noteAdder = 0
    #Adds three notes to the list chord which will compose a triad.
    while noteAdder < 3:
        chord.append(userScale[firstNote])
        firstNote = firstNote + 2
        if firstNote >= len(userScale):
            firstNote = firstNote - len(userScale)
        noteAdder = noteAdder + 1
    return chord 

def fillFirstChord(userScale):
    #Since the first chord of the progression should be the root
    chord = []
    firstNote = 0
    noteAdder = 0
    while noteAdder < 3:
        chord.append(userScale[firstNote])
        firstNote = firstNote + 2
        if firstNote >= len(userScale):
            firstNote = firstNote - len(userScale)
        noteAdder = noteAdder + 1
    return chord

def createChordProgression(userScale):
    #Four separate chords are treated as four separate lists
    chord1 = fillFirstChord(userScale)
    chord2 = fillChord(userScale)
    chord3 = fillChord(userScale)
    chord4 = fillChord(userScale)
    print "Chord Progression"
    print chord1
    print chord2
    print chord3
    print chord4


        
print "Welcome to the Scale Generator!"
print "Would you like to begin?"
print "1) Yes"
print "2) No"
start = input()
if start == 1:
    endcondition = 0
    while endcondition == 0:
        chooseScale()
        print "Would you like to create another chord progression?"
        print "1) Yes"
        print "2) No"
        choice = input()
        if choice == 2:
            endcondition = 1
