package midterm;
public class Methods {

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     */
    // There are several ways of solving this question
    // For me, swapping number is easier to understand
    // I take any value, compare with next value
    // If current value is bigger, I change their indexes
    // I reset loop back to zero using i = -1
    // I did something similar when practicing. Cool stuff.
    public int[] sortIntArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] > inputArray[i+1]){
                int currentValue = inputArray[i];
                inputArray[i] = inputArray[i+1];
                inputArray[i+1] = currentValue;
                i = -1;
            }
        }
        return inputArray;
    }


    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * input -> 123
     * returned value -> 6  (1 + 2 + 3)
     * points: 20
     */
    // Before midterm, Deepak provided us with interesting article
    // I managed to turn int into String
    // After that its simple, split digits, sum them up and return total
    // When adding digits together, it's important to turn them back into digits
    public int sumOfDigits(int num) {
        String number = String.valueOf(num);
        String[] digitArray = number.split("");
        int sum = 0;
        for (int i = 0; i < digitArray.length; i++) {
            sum += Integer.valueOf(digitArray[i]);
        }
        return sum;
    }


    /**
     * Ques-3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 30
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     */
    // This is very similar to other question that we practiced in class
    // Its in class11 folder, labeled Foysal Question. There I also had to create new array.
    // Here I used similar logic, found all unique numbers, not equal to one to remove
    // Made new array, using count of unique numbers as length for new array
    // After that, iterated original array and only added unique values to new Array
    public int[] removeInt(int[] numberArray, int inputValue){
        int uniqueNumbers=0;
        for (int i = 0; i < numberArray.length; i++) {
            if (inputValue != numberArray[i]) {
                uniqueNumbers++;
            }
        }
        int[] updatedArr = new int[uniqueNumbers];
        int counter = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (inputValue != numberArray[i]){
                updatedArr[counter] = numberArray[i];
                counter++;
            }
        }
        return updatedArr;
    }


    /**
     * Ques-4:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 40
     * Note: two input-String-arrays can be of same size or different size
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     */
    // I practiced similar question before when doing course on Udemy
    // I used outer loop to pick values of first array.
    // Inner loop grabs every single value of second loop, compares it to current value from first array
    // Once inner loop runs out of values, it escapes and Outer loop starts cycle again using next value
     public void findCommonStrings(String[] arrOne, String[] arrTwo) {
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (arrOne[i].equalsIgnoreCase(arrTwo[j])){
                    System.out.println("-> "+arrOne[i].toLowerCase());
                }
            }
        }
    }
}