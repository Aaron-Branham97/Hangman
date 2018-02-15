package hangman;
import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };

    private String word;

    private List<Character> usedLetters;

    private int numMisses;

    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
        numMisses = 0;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean available(char c) {
        if ( usedLetters.contains(c) ) return false;
        else return true;
        
    }

    public int guess(char c) {
        int numTimes = 0;
        usedLetters.add(c);
        for ( int i = 0; i < word.length(); i ++ ) {
            if ( word.charAt(i) == c ) {
                numTimes += 1;
            }
        }
        if ( numTimes == 0 ) {
            numMisses += 1;
        }
        return numTimes;
    }

    public String getGuessedWord() {
        String a = "";
        for (int i = 0; i < word.length(); i++) {
            if ( usedLetters.contains(word.charAt(i)) ) {
                a += String.valueOf(word.charAt(i));
            }
            else a += "*";
        }
        return a;
    }

    public int getNumMisses() {
        return numMisses;
    }

    public Result getResult() {
        if (numMisses >= 6) {
            return Result.LOSE;
        }
        if (getGuessedWord().equals(word)) {
            return Result.WIN;
        }
        return Result.NONE;
    }

    @Override
    public String toString() {
        return getGuessedWord();
    }

}
