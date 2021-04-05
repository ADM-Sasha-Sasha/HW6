import com.sun.source.tree.BreakTree;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        //boolean found = false;
        String[] phrases = phrase.split(" ");
        String[] word = {"pass", "key", "login", "email"};

        for (String phr : phrases) {
            for (String wrd : word)
                if (wrd.equalsIgnoreCase(phr)) {
                    return true;

            }
        }
        return false;
    }
}

        /**if (!found) {
            found = true;
        }else {
            return false;
        }
        return found;
    }**/



