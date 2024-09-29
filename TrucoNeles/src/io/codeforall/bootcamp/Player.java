package io.codeforall.bootcamp;

public class Player {

        public int number;
        public String name;

        public Player (String playerName){
                this.name = playerName;
        }

        NumberGenerator playerRandomNumber = new NumberGenerator();
        public int getGameRandomNumber() {
                return number = playerRandomNumber.getRandomNumber();
        }
}







