import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public  class wpm
{
    public void CountDown() throws InterruptedException
    {
        System.out.println("Welcome to typing test, Your test starts in ");
        System.out.println("5");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("4");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("START!!!");
    }

    public void genrateRandomWords()
    {
        for(int i=0;i<60;i++)
        {
            Random rand = new Random();
            String randomWords = listOfWords.words[rand.nextInt(300)];
            System.out.print(randomWords + " ");
        }
        System.out.println();
    }

    public static void userInput()
    {
        double start = System.currentTimeMillis();
            Scanner sc = new Scanner(System.in);
            String typedWords = sc.nextLine(); //user field
        double end = System.currentTimeMillis();

        //no of words:
        String[] words = typedWords.split(" ");
        int wordCount = words.length; //DONE

        double timeinMin = ((end - start)/60000);
         //System.out.println("Time in min: "+timeinMin); //0.SOMETHING
        wpm(wordCount,timeinMin);
    }

    public static void wpm(int noofWords, double timetakeninmins)
    {
        double wpm = ((noofWords) / timetakeninmins);
        System.out.println("Your WPM is: " +wpm);
    }

}




