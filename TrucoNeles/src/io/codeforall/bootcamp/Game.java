package io.codeforall.bootcamp;

public class Game {

    public int number;

    NumberGenerator gameRandomNumber = new NumberGenerator();
    public int getGameRandomNumber() {

        return this.number = gameRandomNumber.getRandomNumber();
    }


    // Pede ao gerador de numero um numero - getRandomNumber
    // armazena o valor do jogo - ok

    // player solita um numero
    //armazena o numero

}
