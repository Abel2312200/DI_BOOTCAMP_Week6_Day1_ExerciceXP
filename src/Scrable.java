import java.util.HashMap;

public class Scrable {


    // class attributes

    private HashMap<Character, Integer> valueLetter = new HashMap<>();
    valueLetter.put('A',1);
    private String word;
    /**
    String onePointWords = "DG";
    static String twoPointWords = "DG";
    static String  threePointWords = "BCMP";
    static String fourPointWords = "FHVWY";
    static String fivePointWords = "K";
    static String heightPointWords = "JX";
    static String tenPointWords = "QZ"; */
    // class methods

    /*
     * It's the first constructor of the class
     * */
    public Scrable(){
        word = "";
    }

    /*
    * It's the second constructor of the class
    * */
    public Scrable(String word){
        this.word = word;
    }

    /*
     * this method returns the value of the word attribute
     * @param : empty
     * @returns :
     *  - word : String
     * */
    public String getWord() {
        return word;
    }

    /*
    * this method sets the value of the word attribute
    * @param :
    *  - word : String
    * @returns : void
    * */
    public void setWord(String word) {
        this.word = word;
    }

    /*
    * Commute and returns the score for the current word
    * @param : empty
    * @returns : int
    * */
    public int getScore(){
        return 1;
    }
}
