import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        wpm m = new wpm();
        m.CountDown();
        m.genrateRandomWords();
        m.userInput();

    }

}