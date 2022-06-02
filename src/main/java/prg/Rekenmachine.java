package prg;

public class Rekenmachine {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }


    public static int subtract(int number1, int number2) {
        return number1 + -number2;
    }

    public static int multply(int number1, int number2) {
        int getal = 0;
        for (int i = 1; i <= number2; i++) {
            getal += number1;
        }
        return getal;
    }

    /*
     * Zorg ervoor dat number1 deelbaar is door number2
     *
     * Of: wijzig de nodige types zodat je ook andere delingen kan maken.
     */

    public static int devide(int number1, int number2) {
        int getal = 0;
        while (number1 >= number2) {
            number1 = subtract(number1, number2);
            getal++;
        }
        return getal;
    }

    // HINT: misschien kan je de methode subtract hierbij gebruiken.

    /*
     * Methode hieronder is voor een tweede machtsverheffing
     */

    public static int square(int number1) {
        // HINT: multiply???

        return multply(number1, number1);
    }

    /*
     * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een
     * willekeurige macht, het exponent 'number2'
     */

    public static int exponentiation(int number1, int number2) {
        // HINT: multiply???
        int getal = 0;
        for (int i = 0; i < number2 - 1; i++) {
            getal = multply(getal == 0 ? number1 : getal, number1);
        }
        return getal;
    }

}
