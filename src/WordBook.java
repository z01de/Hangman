import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordBook {
    private static final List<String> words = new ArrayList<>(List.of(
        "Стул", "Человек", "Обезьяна", "Собака", "Стол"
    ));

    public static String getRandomWord(){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
