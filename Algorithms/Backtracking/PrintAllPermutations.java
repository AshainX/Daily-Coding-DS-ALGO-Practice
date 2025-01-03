 /*Implementation of java program to print all the permutations of a string
 * With duplicates allowed */
 
/*import java.util.*;
import java.lang.*;
import java.io.*;

public class Print_all_permutations_of_String 
{

    //This function prints all the permutations of the string using Backtracking
    //It contains 3 parameters -
    // 1. Character array of given string
    // 2. Starting index of string
    // 3. Ending index of string
    public void permutation(char[] charArr, int start, int size) 
    {
        int x;
        if (start == size)   //condition to check whether the char array is completely traversed or not
        {
            for (int i = 0; i < charArr.length ; i++) 
            {
                System.out.print(charArr[i]);   //printing of permutations
            }
            System.out.println();
        } 
        else 
        {
            for (x = start; x < size; x++) 
            {
                swap(charArr, start, x);        //function call to swap
                permutation(charArr, start + 1, size);      //recursion call
                swap(charArr, start, x);
            }
        }
    }

    
    //This parameterized function swaps the ith and jth position from the character array
    //It contains 3 parameters - Character array and ith and jth postion in it
    public void swap(char[] charArr, int i, int j) 
    {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }

    public static void main(String[] args) throws java.lang.Exception 
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();   //taking a string as an input
        char[] arr = s.toCharArray();   //storing all the characters in the string in a character array
        Print_all_permutations_of_String obj = new Print_all_permutations_of_String();
        obj.permutation(arr, 0, arr.length);    //function call to print the permutations of string
    }
}*/

import java.util.Scanner;

public class PrintAllPermutations {

    /**
     * This function prints all permutations of the string using backtracking.
     * 
     * @param charArr - Character array of the given string
     * @param start   - Starting index
     * @param size    - Size of the character array
     */
    public void permutation(char[] charArr, int start, int size) {
        if (start == size) { // Check if the character array is fully traversed
            for (char c : charArr) {
                System.out.print(c); // Print permutation
            }
            System.out.println();
        } else {
            for (int x = start; x < size; x++) {
                swap(charArr, start, x); // Swap to create new permutation
                permutation(charArr, start + 1, size); // Recursive call
                swap(charArr, start, x); // Backtrack by swapping back
            }
        }
    }

    /**
     * Swaps the i-th and j-th positions in the character array.
     * 
     * @param charArr - Character array
     * @param i       - First index
     * @param j       - Second index
     */
    public void swap(char[] charArr, int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine(); // Read input string

        if (input.isEmpty()) {
            System.out.println("Input string is empty. Please provide a valid string.");
        } else {
            char[] arr = input.toCharArray(); // Convert to character array
            PrintAllPermutations obj = new PrintAllPermutations();
            System.out.println("All permutations of the string:");
            obj.permutation(arr, 0, arr.length); // Generate permutations
        }

        sc.close();
    }
}






/*
 * 
 * Sample Input 1: abc
 * 
 * Sample Output 1:
 * 
 * abc
 * acb
 * bac
 * bca
 * cba
 * cab
 * 
 * Sample Input 2: Word
 * 
 * Sample Output 2:
 * 
 * Word
 * Wodr
 * Wrod
 * Wrdo
 * Wdro
 * Wdor
 * oWrd
 * oWdr
 * orWd
 * ordW
 * odrW
 * odWr
 * roWd
 * rodW
 * rWod
 * rWdo
 * rdWo
 * rdoW
 * dorW
 * doWr
 * droW
 * drWo
 * dWro
 * dWor
 * 
 * 
 * Time and Space complexity -
 * 
 * For any given string of length n there are n! possible permutations,
   and we need to print all of them so Time complexity is O(n * n!).
   
 * The function will be called recursively and will be stored in call 
   stack for all n! permutations, so Space complexity is O(n!).
   
 */