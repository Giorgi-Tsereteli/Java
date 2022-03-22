package arrays;

public class Homework6 {
    public static void main(String[] args) {

        // Deepak said to also practice writing pseudocode as an exercise.
        // I wrote how I approach solving questions and what right/wrong logic I create.


        /**
         * Q1:
         * Create the abbreviation
         * Exmaple: call of duty -> COD
         */
        // I need to turn sentence into individual words
        // After, I need to separate first char of every word to create new abbreviation
        // I need new variable which will hold these characters
        // I need loop to perform adding function as many times as the number of words in sentence
        System.out.println("\n1)");
        String carCompany = "baVariAN mOTor WoRKs";
        String[] companyWordArray = carCompany.split(" ");
        String bmwAbbreviation = "";
        for (int i=0;i<companyWordArray.length;i++){
            //revWord += wordArray[i].substring(0,1).toUpperCase();      // <-- substring method
            bmwAbbreviation += companyWordArray[i].toUpperCase().charAt(0);    // <-- charAt method
        }
        System.out.println(carCompany+" -- Abbreviation --> "+bmwAbbreviation);


        // While Loop
        String arnoldQuote = "I will be Back!";
        String[] secondWordArray = arnoldQuote.split(" ");
        String quoteAbbreviation = "";
        int k=0;
        while (k< secondWordArray.length){
            quoteAbbreviation += secondWordArray[k].substring(0,1).toUpperCase();
            k++;
        }
        System.out.println(arnoldQuote+" -- Abbreviation --> "+quoteAbbreviation);



        /**
         * Q2:
         * Reverse the given String
         * happy birthday to you -> you to birthday happy
         */
        // I need to split sentence into separate words
        // I should read sentence backwards, meaning I need to start from last index
        // As in previous example, variable should hold reversed sentence and loop will help to add words multiple times
        // I need to create empty space between words. Last iteration of loop will create extra space.
        // trim method can help to remove space. I used debug tool to make sure it works.
        System.out.println("\n2)");
        String movieQuote = "Houston we have a problem";
        String[] movieWordArray = movieQuote.split(" ");
        String movieQuoteAbbreviation = "";
        int j= movieWordArray.length-1;
        do {
            movieQuoteAbbreviation += movieWordArray[j]+" ";
            j--;
        } while(j >= 0);
        movieQuoteAbbreviation = movieQuoteAbbreviation.trim();
        System.out.println(movieQuote+" -- Reverse Words ---> "+movieQuoteAbbreviation);



        /**
         * Q3:
         * Convert the String value in to Titlecase
         */
        // Same split, loop and variable logic as in previous example.
        // Difference is, I need to target first char and make it UpperCase.
        // substring method takes care of first char as well as any number of chars that follow first.
        // trim method removes extra spaces in the end of sentence.
        System.out.println("\n3)");
        String movieTitle = "lOrd OF tHe rInGS";
        String[] titleWordArray = movieTitle.split(" ");
        String movieTitlecase = "";
        for (int i=0; i<titleWordArray.length; i++){
            movieTitlecase += titleWordArray[i].substring(0,1).toUpperCase()+titleWordArray[i].substring(1).toLowerCase()+" ";
        }
        movieTitlecase=movieTitlecase.trim();
        System.out.println(movieTitle+" -- In Titlecase --> "+movieTitlecase);



        /**
         * Q4:
         * Find the minimum value from the given array
         */
        // First, I thought to compare value[0] to every other value
        // If any value was less than that, I wanted to assign it to be index[0]
        // If I could keep re-assigning smaller values to index[0], at the end index[0] will be minimal value
        System.out.println("\n4)");
        int[] numbers = {87, 23, 89, 0, 54, 150, 23, -1, -2};
        int count = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[count] < numbers[0]){
                numbers[0] = numbers[count];
            }
            count++;
        }
        System.out.println("Minimum number from array --> " + numbers[0]);


        /**
         *  Comments:
         *  After solving Q4 using my weird code, I checked web for better solutions.
         *
         *  Q4 should be done in more effective way by making count variable equal to numbers[0].
         *  Then, there is no need to increment count variable like I did. Instead, using if/else, I should have stored min value in the count variable.
         *
         *  For learning purposes I kept my code. Will use better way for upcomming assignments.
         */
    }
}
