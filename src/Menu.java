import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private static final int START_GAME = 1;
    private static final int EXIT = 2;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    private void display() {
        System.out.println("\nwelcome to the hangman game");
        System.out.println("do you want to play?\n");
        System.out.println("1 - start game");
        System.out.println("2 - exit\n");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> option1();
            case 2 -> option2();
            default -> System.out.println("invalid choice");
        }
    }

    private void option1() {
        Game game = new Game();
        game.play();
    }

    private void option2() {
        System.exit(0);
    }

    public void run() {
        int choice = 0;
        while (choice != 2) {
            display();
            System.out.print("select menu item: ");
            choice = scanner.nextInt();
            System.out.println();
            handleChoice(choice);
        }
    }
}