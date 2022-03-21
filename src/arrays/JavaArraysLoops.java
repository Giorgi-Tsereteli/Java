package arrays;

public class JavaArraysLoops {
    public static void main(String[] args){

        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         */
        String country = "Ukraine";
        System.out.println("\n1)\nCountry Name --> "+country);
        System.out.println(" - Length using array method --> "+country.split("").length);

        String secondCountry = "United Kingdom";
        System.out.println("Country Name --> "+secondCountry);
        System.out.println(" - Word count using array method --> "+secondCountry.split(" ").length);


        /**
         * Q2:
         * Print the number of words in the sentence
         */
        String sentence = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\n2)\nNumber of words in sentence --> "+sentence.split(" ").length);


        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         */
        System.out.println("\n3)\nAbbreviation For Sentences");
        String firstSentence = "Stop War In Ukraine";
        String[] eachWordArray = firstSentence.split(" ");

        // Not effective (hardcoded for 4 word sentence ONLY)
        String abbreviation = (eachWordArray[0].substring(0,1)+eachWordArray[1].substring(0,1)+eachWordArray[2].substring(0,1)+eachWordArray[3].substring(0,1)).toUpperCase();
        System.out.println("Substring Method --> "+abbreviation);

        // What if user enters more than 4-word sentence ?
        // Following loop can accept any sentence length.
        String secondSentence = "President of the United States";
        String[] secondEachWordArray = secondSentence.split(" ");
        String secondAbbreviation="";
        for (int i=0; i<secondEachWordArray.length; i++){
            String firstChar = secondEachWordArray[i].substring(0,1).toUpperCase();
            secondAbbreviation += firstChar;
        }
        System.out.println("For Loop Example --> "+secondAbbreviation);


        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         */
        System.out.println("\n4)");
        int num = 30;
        if (num%5==0 && num%3==0){
            System.out.println(num+" --> divisble by 5 and 3");
        } else if (num%5==0){
            System.out.println(num+" --> divisible by 5");
        } else if (num%3==0){
            System.out.println(num+" --> divisible by 3");
        } else if (num%5!=0&&num%3!=0){
            System.out.println(num+" --> NOT divisible by 5 and 3");
        }


        /**
         * Q5:
         * Create variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         */
        System.out.println("\n5)");
        double studentScore = 81;
        int maxScore = 100;
        double percentage = (studentScore/maxScore)*100;

        if (studentScore > 100 || studentScore < 0) {
            System.out.println("Invalid Student Score Entered. Allowed 0-100");
        } else if (maxScore != 100) {
            System.out.println("Invalid Max Score Entered. Allowed is 0-100");
        } else if (percentage >= 90.99 && percentage <= 100) {
            System.out.println("Grade A");
        } else if (percentage >= 81 && percentage<=90.99) {
            System.out.println("Grade B");
        } else if (percentage >= 71 && percentage <= 80.99) {
            System.out.println("Grade C");
        } else if (percentage >= 61 && percentage <= 70.99) {
            System.out.println("Grade D");
        } else if (percentage <= 60.99) {
            System.out.println("Grade D");
        }


        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         * expected answers: learning, living standard
         */
        System.out.println("\n6)");
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
        for (int i=0;i<words.length;i++){
            if (words[i].length() > 5 && words[i].toLowerCase().startsWith("l")){
                System.out.println(words[i]);
            }
        }

    }
}