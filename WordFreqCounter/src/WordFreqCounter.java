import java.util.HashMap;
import java.util.Map;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float count = 0f;
        String[] phrase2 = phrase.split(" ");
        for (String s : phrase2) {
            if (word.equalsIgnoreCase(s)) {
                count++;
            }
        }
        count /= phrase2.length;
        return count;
    }
}
