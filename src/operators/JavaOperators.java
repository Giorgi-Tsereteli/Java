package operators;

public class JavaOperators {
    public static void main(String[] args) {

        /**
         * Due date: Mar 8 2022
         * Refer for formulas: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * 1) C -> F
         * 2) C -> K
         * 3) F -> C
         * 4) F -> K
         * 5) K -> C
         * 6) K -> F
         */

        // 1) C -> F
        // The temperature in Fahrenheit (°F) equals to ->  Celsius (°C) times 9/5 plus 32
        double cTemp = 0;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n1) "+cTemp+"°C is equal to "+fTemp+"°F");

        // 2) C -> K
        // The Temperature in Kelvin (K) is equal to -> Celsius (°C) plus 273.15
        double cTemp2 = 10;
        double kTemp2 = cTemp2 + 273.15;
        System.out.println("2) "+cTemp2+"°C is equal to "+kTemp2+"°K");

        // 3) F -> C
        // The Temperature in Celsius (°C) is equal to -> Fahrenheit (°F) minus 32, times 5/9
        double fTemp3 = 60;
        double cTemp3 = (fTemp3 - 32) * 5/9;
        System.out.println("3) "+fTemp3+"°F is equal to "+cTemp3+"°C");

        // 4) F -> K
        // The Temperature in Kelvin (K) is equal to -> Fahrenheit (°F) plus 459.67, times 5/9
        double fTemp4 = 451;
        double kTemp4 = (fTemp4 + 459.67) * 5/9;
        System.out.println("\n4) "+fTemp4+"°F is equal to "+kTemp4+"°K");

        // 5) K -> C
        // The Temperature in Celsius (°C) is equal to -> Kelvin (K) minus 273.15
        double kTemp5 = 300;
        double cTemp5 = kTemp5 - 273.15;
        System.out.println("5) "+kTemp5+"°K is equal to "+cTemp5+"°C");

        // 6) K -> F
        // The Temperature in Fahrenheit (°F) is equal to -> Kelvin (K) times 9/5, minus 459.67
        double kTemp6 = 280;
        double fTemp6 = (kTemp6 * 9/5) - 459.67;
        System.out.println("6) "+kTemp6+"°K is equal to "+fTemp6+"°F");

    }
}