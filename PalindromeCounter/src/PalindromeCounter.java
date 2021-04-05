class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {
        String[] wa = phrase.split(" ");
        int i = 0;
        for (int j = 0; j < wa.length; j++) {
            String t = wa[j];
            StringBuilder result = new StringBuilder(t).reverse();
            String ra = result.toString();
            if (t.equalsIgnoreCase(ra)) {
                i++;
            }
        }
        return i;
    }
}
