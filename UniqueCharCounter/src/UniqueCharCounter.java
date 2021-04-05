import java.util.HashSet;
import java.util.Set;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {
    public int count(String phrase) {
        char [] input=phrase.toCharArray();
        Set<Character> charset=new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            charset.add(input[i]);
        }
        return charset.size();
    }
}

