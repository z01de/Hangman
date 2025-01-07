import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static int mistakesCount = 0;
    private final Scanner scanner;

    public Game(){
        scanner = new Scanner(System.in);
    }

    public void play() {
        GameWord gameWord = new GameWord(WordBook.getRandomWord());
        List<Character> checkedLetters = new ArrayList<>();
        while(mistakesCount < 6) {
            System.out.println("hidden word: " + gameWord.getRevealedWord());
            System.out.print("\ntry to guess the letter: ");
            char letter = scanner.next().charAt(0);
            if(checkedLetters.contains(letter)) {
                System.out.println("have you already checked this letter\n");
                continue;
            }
            checkedLetters.add(letter);
            if(gameWord.guess(letter)){
                if(gameWord.isGameWon()){
                    System.out.println("you won!\nhidden word: " + gameWord.getRevealedWord());
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    return;
                }
                System.out.println("right!\nmistakes: " + mistakesCount);
            }
            else{
                System.out.println("wrong!\nmistakes: " + mistakesCount);
                    mistakesCount++;
            }
            drawGallow(mistakesCount);
        }
        System.out.println("you lose!");
    }

    private void drawGallow(int mistakesCount){
        switch(mistakesCount){
            case 0 -> System.out.println(Hangman.MISTAKE0.getGallow());
            case 1 -> System.out.println(Hangman.MISTAKE1.getGallow());
            case 2 -> System.out.println(Hangman.MISTAKE2.getGallow());
            case 3 -> System.out.println(Hangman.MISTAKE3.getGallow());
            case 4 -> System.out.println(Hangman.MISTAKE4.getGallow());
            case 5 -> System.out.println(Hangman.MISTAKE5.getGallow());
            case 6 -> System.out.println(Hangman.MISTAKE6.getGallow());
        }
    }

}
