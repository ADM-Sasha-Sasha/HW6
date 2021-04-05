class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {
    public String create(String text) {
        String res = "";
        char[] txt = text.toCharArray();
        if (txt.length <= 15) {
            return text;
        }
        for (int i = 0; i < txt.length; i++) {
            if (txt[15] != ' ') {
                res =text.substring(0, 15);
                return res + "...";
            }
        }
        return text.substring(0, 15);
    }
}
