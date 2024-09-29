package io.codeforall.bootcamp;

public class NumberGenerator {
    private int randomNumber;

    public int getRandomNumber(){
        return (int) (Math.random() * 11);

    }
}
