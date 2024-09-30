package io.codeforall.bootcamp.exercise;

public class Ai {

    private String creationDate;
    private String name;

    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;
    }

    // getter and setter
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // double array
    public static int[] doubleArray(int[] array) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;


        }
        return result;
    }

    //FACTORIAL ITERATIVE
    public int factorialIterative(int n) {

        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // FACTORIAL RECURSIVE
    public int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    private boolean isPalindrome(String str) {
        str = str.toLowerCase();

        if (str.length() <= 1) {
            return true;
        }
        char lastLetter = str.charAt(str.length() - 1);
        char firstLetter = str.charAt(0);

        if (lastLetter == firstLetter) {
            String sub = str.substring(1, str.length() - 1);
            return isPalindrome(sub);
        }

        return false;
    }

    public String palindromeReplace(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "palindrome";
            }


        }


        return String.join(" ", words);
    }


    public static boolean isValidEmailAddress(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";



        }
        return !isEmailIdValid;
    }
}



