import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

class Phrase {
    private String[] words;

    Phrase(String[] words) {
        /* this.words = words; */
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String i : words){
            result.append(i).append(" ");
        }
        return result.toString();
    }
}