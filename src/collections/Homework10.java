package collections;

import java.util.*;

public class Homework10 {

    // Due Date -> Apr 12
    /**
     * Question-1:
     * Create a method that can return if a given-String-Array has duplicate values or not.
     * Input: String-Array
     * Return type: boolean
     */
    public static boolean isDuplicate (String[] strArr) {
        List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        Set<String> strSet = new HashSet<>(strList);
        boolean isDuplicate = false;
        if (strList.size() != strSet.size()){
            isDuplicate = true;
        }
        return isDuplicate;
    }


    /**
     * Question-2:
     * Create a method that would return the duplicate values of given-String-array (ignore the case)
     *
     * Input: String-Array
     * Return type:     (one of these -> Array, List, Set)
     * String[] names = {"abc" , "abc" , "DEF", "ABC", XYZ", "def"}
     * "abc", "def"
     */
    public static Set<String> countDuplicate (String[] strArr) {
        Set<String> duplicateList = new HashSet<>();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equalsIgnoreCase(strArr[j])){
                    duplicateList.add(strArr[i].toLowerCase());
                }
            }
        }
        return duplicateList;
    }

    public static void main(String[] args) {

        // Q1
        // I convert given String[] to List using Arrays class and asList() method
        // Also convert above List to Set
        // Set can't accept duplicates. If size of both collections isn't same, it means we have duplicates
        System.out.println("\nQ1)");
        String[] strArr = {"java","python","java","JS","pHp","jS","SelEnium","sql"};
        boolean isDuplicate = isDuplicate(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println("Does the above array have duplicate values ? --> "+isDuplicate);


        // Q2
        // I use nested for loop to find if there are any duplicate values present inside given String[]
        // Nested loop technique is very similar to what I used for midterm.
        // Trick is to start inner loop from i+1 instead of 0. That way your comparison is correct.
        // If condition inside inner loop evaluates true, I add above-mentioned duplicates into a Set
        // I can have many duplicate values but requirement is to show one instance, not all. [abc] <-- --> [abc,abc,abc...abc]
        // Set takes cares of that and accepts just one value. I convert value to lowercase which prevents adding same value of different format
        System.out.println("\nQ2)");
        String[] names = {"abc" , "aBc" , "deF", "ABC", "XYZ", "DEF", "DEf","def","abC"};
        Set duplicates = countDuplicate(names);
        System.out.println(Arrays.toString(names));
        System.out.println("Duplicate values from above array --> " + duplicates);
    }
}