package CodeTest1;

import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {

        Methods object = new Methods();

        //Q1
        System.out.println("\n\n--- Q1 ---");
        int[] numArr = {100, 70, 30, 50, 10, 90, -1, 0};
        System.out.println("Sort Following Array\n" + Arrays.toString(numArr));
        int[] sortedArray = object.sortIntArray(numArr);
        System.out.println(Arrays.toString(sortedArray));


        //Q2
        System.out.println("\n\n--- Q2 ---");
        int number = 101;
        int sumOfDigits = object.sumOfDigits(number);
        System.out.println("Sum of digits of "+number+" = "+sumOfDigits);


        //Q3
        System.out.println("\n\n--- Q3 ---");
        int[] numbersArray = {11, 78, 109, 65, 34, -44, 12};
        int removeFromArr = 109;
        System.out.println("Remove number "+removeFromArr+" from following Array\n"+Arrays.toString(numbersArray));
        int[] newArray = object.removeInt(numbersArray,removeFromArr);
        System.out.println(Arrays.toString(newArray));


        //Q4
        System.out.println("\n\n--- Q4 ---");
        String[] arr1 = {"MeRCEdes", "Audi", "PorsSChe", "Dodge SRT", "bmw"};
        String[] arr2 = {"dodge", "mercedes", "GeNesIs", "BmW"};
        System.out.println("Print Common String(s) in Two Arrays");
        object.findCommonStrings(arr1, arr2);
    }
}