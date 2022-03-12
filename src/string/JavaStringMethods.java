package string;

public class JavaStringMethods {
    public static void main(String[] args) {
        /**
         * NOT ASSIGNMENT - Just practice
         *
         * Task: verify if statement("nEw YorK TimES") contains "NeW"
         * Note: pls ignore the cases
         * Expected result: true
         *
         * ---> Pseudo coding <---
         * convert statement into uppercase -> "NEW YORK TIMES" (statement_U)
         * convert "NeW" into uppercase -> "NEW" (new_U)
         * apply contains method on statement_U with new_U
         *
         */

        // E.g -> 2 Variables
        String cityName = "nEw YorK TimES";
        String charSequence = "NeW";
        System.out.println("\n"+cityName.toUpperCase().contains(charSequence.toUpperCase()));

        // E.g -> 1 Variable
        System.out.println("\n"+cityName.toUpperCase().contains("NeW".toUpperCase()));

        // E.g -> No Variables
        System.out.println("\n"+"nEw YorK TimES".toUpperCase().contains("NeW".toUpperCase()));
    }
}
