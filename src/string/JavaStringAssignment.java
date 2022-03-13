package string;

import java.util.Locale;

public class JavaStringAssignment {

    public static void main(String[] args) {

        /**
         * Task -1
         *
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         *
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result1 should be 15
         *
         * print:
         *     1) value of sentence1
         *     2) length of sentence1
         *     3) value of result1
         */
        String sentence1 = "hhhh";
        System.out.println("\nTask 1:\n1) Value of setence1 --> "+sentence1);
        System.out.println("2) Length of setence1 --> "+sentence1.length());

        int result1 = sentence1.length() >= 5 ? 10 : 15;
        System.out.println("3) Value of Result1 -> "+ result1);



        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         */
        String myName = "Giorgi Tsereteli";
        System.out.println("\nTask 2:\n1) Length of my name --> "+myName.length());

        String myName_L = myName.toLowerCase();
        String charCheckWith = "a".toLowerCase();
        boolean isCharPresent = myName_L.endsWith(charCheckWith);

        System.out.println("2) Does name end with 'a'? --> "+isCharPresent);
        System.out.println("3) Does name contain 'a'? --> "+myName_L.contains(charCheckWith));



        /**
         *  Task 3
         *
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String task3_L = task3.toLowerCase();
        String seqCheck = "king".toLowerCase();
        boolean isSeqPresent = task3_L.contains(seqCheck);
        System.out.println("\nTask 3:\n1) Does Task3 contain 'king' --> "+isSeqPresent);

        seqCheck = "EW".toLowerCase();
        System.out.println("2) Index of First Occurance of 'EW' --> "+task3_L.indexOf(seqCheck));

        // I decided to assign new value to seqCheck on line 66 instead of creating new var



        /**
         * Task 4
         *
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String task4 = "kINg";
        String task4Queen = "QUEEN";
        String task4_L = task4.toLowerCase();
        String task4Queen_L = task4Queen.toLowerCase();

        // Using substring() method
        String task4_T = task4_L.substring(0,1).toUpperCase() + task4_L.substring(1,4);
        System.out.println("\nTask 4:\n1) Convert 'kINg' to Titlecase --> "+task4_T);

        // Using replace() method
        String task4Queen_T = task4Queen_L.replace("q","Q");
        System.out.println("2) Convert 'QUEEN' to Titlecase --> "+task4Queen_T);




        /**
         * Comments:
         * In some examples above, it's possible to apply methods directly to sout statement
         * No need to create extra variables.
         *
         * For pseudo coding practice I created vars which can be reused later.
         * At future job, if I can't or don't need to use var multiple times, I will avoid creating unnecessary extra variables.
         */
    }
}
