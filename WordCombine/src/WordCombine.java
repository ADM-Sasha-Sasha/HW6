import java.util.Locale;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {

    private int i;

    public boolean canCombine(String sourceWord, String targetWord) {
        String[] sW = sourceWord.split(" ");
        String[] rW = targetWord.split(" ");
        for (String a : sW)
            for (String b : rW) {
            if (sourceWord.toLowerCase().contains(targetWord.toLowerCase().substring(i, i + 1))) {
                //return true;
            } else {
                return false;
            }
        }
        return true;
    }
}