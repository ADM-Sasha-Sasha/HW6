class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {
    public boolean detect(String text) {
        String[] txt = text.split(" ");
        String[] num = {"1","2","3","4","5","6","7","8","9","0"," "};
        for (String xtx : txt) {
            for (String mun : num) {
                if (mun.equals(xtx)) {
                    return true;
                }
            }
        }
        return false;
    }
}
