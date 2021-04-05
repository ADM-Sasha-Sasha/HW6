import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class PunctuationMarkCounter {
    public int count(String phrase) {
        int before = phrase.length();
        int after = phrase.replaceAll("[.,!?;:]", "").length();
        int result = before - after;
        return result;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

