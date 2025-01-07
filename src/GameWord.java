public class GameWord {
    private final String secretWord;
    private String revealedWord;

    public GameWord(String secretWord) {
        this.secretWord = secretWord.toLowerCase();
        this.revealedWord = hide(secretWord);
    }

    private String hide(String word) {
        return "_".repeat(word.length());
    }

    public boolean guess(char letter) {
        StringBuilder stringBuilder = new StringBuilder(revealedWord);
        if(secretWord.contains(String.valueOf(letter).toLowerCase())) {
            for(int i = 0; i < secretWord.length(); i++) {
                if(secretWord.charAt(i) == Character.toLowerCase(letter)) {
                      stringBuilder.setCharAt(i, secretWord.charAt(i));
                }
            }
            revealedWord = stringBuilder.toString();
            return true;
        }
        return false;
    }

    public boolean isGameWon(){
        return revealedWord.equals(secretWord);
    }

    public String getRevealedWord() {
        return revealedWord;
    }
}
