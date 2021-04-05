class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String res;
       res = phrase.replaceAll("\\s{2,}", " ").trim();
        return res;
    }
}
