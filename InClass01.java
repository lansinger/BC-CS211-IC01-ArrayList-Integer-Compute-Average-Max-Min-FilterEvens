// Diane Lansinger
// CS 211
// In Class Exercise 01
// 07-07-20

import java.util.*; //import for ArrayList
import java.io.*;   //import for File Input

public class InClass01 {

    public static void main (String[] args) 
        throws FileNotFoundException {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("Numbers.txt"));
        while (input.hasNextInt()) {
            int n = input.nextInt();
            numbers.add(n);
        }
        //intro
        System.out.println("IC01 List of Numbers: ");

        //print the list of numbers
        System.out.println(numbers);
       
        //prints a count of the total numbers
        System.out.println("List size: " + numbers.size() + " numbers");

        //prints out the average of the numbers
        System.out.println("Average of all numbers in list: " + average(numbers));
        
        //prints out the maximum of the numbers
        System.out.println("Maximum number in list: " + max(numbers));

        //prints out the minimum of the nubmers        
        System.out.println("Minimum number in list: " + min(numbers));

        //filters out and print out only the even numbers
        filterEvens(numbers);
        System.out.println("All odd numbers in list: " + numbers);        
    }
           
    //computes the average of the numbers
    public static int average(ArrayList<Integer> list){
        int sum = 0;        
        for (int i = list.size() - 1; i >= 0; i--){
            int n = list.get(i);
            sum += n;
        }
        int average = sum / list.size();
        return average;
    }

    //computes the max of the numbers
    public static int max(ArrayList<Integer> list){
        int max = 0;
        for (int i = list.size() - 1; i >= 0; i--){
            int n = list.get(i);
            if (n > max){
                max = n;
            }
        }
        return max;
    }
    
    //computes the min of the numbers
    public static int min(ArrayList<Integer> list){
        int min = list.size();
        for (int i = list.size() - 1; i >= 0; i--){
            int n = list.get(i);
            if (n < min){
                min = n;
            }
        }
        return min;
    }

    // Removes all elements with even values from the given list.
    public static void filterEvens(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int n = list.get(i);
            if (n % 2 == 0) {
                list.remove(i);
            }
        }
    }
}