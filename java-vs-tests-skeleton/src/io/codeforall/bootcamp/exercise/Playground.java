package io.codeforall.bootcamp.exercise;

import org.w3c.dom.ls.LSOutput;

public class Playground {

    public static void main(String[] args) {

        //TEST DOUBLE ARRAY
        Ai ai = new Ai("29/09/94", "Igor");

        int[] array = new int[]{1, 2, 3, 4};
        array = Ai.doubleArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("------");
        //TEST LOOP FACTORIAL

        System.out.println(ai.factorialIterative(5));

        System.out.println("------");

        //TEST RECURSIVE
        System.out.println(ai.factorialRecursive(10));

//Plaindrome
        System.out.println(ai.palindromeReplace("Anna Igor"));


        // Regex
        System.out.println(ai.);

    }







}