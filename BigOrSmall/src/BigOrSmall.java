class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {
    public String calculate(String text) {
        int countUp = 0;
        int countLo = 0;

        char[] chArray = text.toCharArray();

        for (char a : chArray) {
            if (Character.isUpperCase(a)) {
                countUp++;
            } else {
                countLo++;
            }
        }
            if (countUp > countLo) {
                return "Big";
            }
            if (countUp < countLo) {
                return "Small";
            } else {
                return "Same";
            }

        }
    }

