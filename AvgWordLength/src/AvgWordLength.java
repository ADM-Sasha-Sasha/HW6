class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    private float sumChar;

    public double count(String phrase) {

        String[] text = phrase.split(" ");
        for (String word : text){
            sumChar += word.length();

        }
        return sumChar/text.length;
    }
}
