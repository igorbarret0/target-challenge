public class Questions {

    public static boolean fibonacci(int n) { // 0, 1, 1, 2, 3, 5, 8

        if (n == 0 || n == 1) {
            return true;
        }

        int first = 0;
        int second = 1;
        int currentValue;

        while (true) {

            currentValue = first + second;
            first = second;
            second = currentValue;

            if (currentValue == n) {
                return true;
            } else if (currentValue > n) {
                return false;
            }
        }

    }

    public static void verifyString(String s) {

        int lowerLetterOccurrences = 0;
        int upperLetterOccurrences = 0;

        for (Character c : s.toCharArray()) {

            if (c.equals('A')) {
                upperLetterOccurrences += 1;
            }

            if (c.equals('a')) {
                lowerLetterOccurrences += 1;
            }
        }

        System.out.println("A quantidade de vezes que a letra 'A' aparece e: " + upperLetterOccurrences);
        System.out.println("A quantidade de vezes que a letra 'a' aparece e: " + lowerLetterOccurrences);
    }

    public static int printResultSum() {

        int index = 12;
        int k = 1;
        int sum = 0;

        while (k < index) {
            k += 1;
            sum += k;
        }

        return sum;

    }

}
