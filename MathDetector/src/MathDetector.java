class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector {
    public boolean isMath(String text) {
        char[] txt = text.toCharArray();
        char[] sym = {'=', '+', '-', '*', '/'};
        for (int i = 0; i < txt.length; i++) {
            for (int j = 0; j < sym.length; j++)
            if (txt[i] == sym[j]) {
                return true;
            }
        }
        return false;
    }
}





