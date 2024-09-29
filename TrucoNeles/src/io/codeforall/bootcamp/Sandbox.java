package io.codeforall.bootcamp;

public class Sandbox {


    public static void main(String[] args) {

        int[] result = new int[3];
        boolean win = false;

        // GAME
        Game truco = new Game();
        result[0] = truco.getGameRandomNumber();
        System.out.println("System start - " + truco.number);

        //PLAYER
        Player player1 = new Player("Mafalda");
        result[1] = player1.getGameRandomNumber();
        System.out.println(player1.name + " start - " + player1.number);

        //PLAYER 2
        Player player2 = new Player("Mékié");
        result[2] = player2.getGameRandomNumber();
        System.out.println(player2.name + " start - " + player2.number);

        while (!win) {
            for (int i = 0; i < result.length - 1; i++) {
                if (result[0] == result[1]) {
                    if (result[0] == result[2]) {
                        System.out.println(player1.name + " and " + player2.name + " tied");
                        win = true;
                        return;
                    }
                    System.out.println(player1.name + " win");
                    win = true;
                    return;
                }
                if (result[0] == result[2]) {
                    if (result[0] == result[1]) {
                        System.out.println(player1.name + "and" + player2.name + " tied");
                        win = true;
                        return;
                    }
                    System.out.println(player2.name + " win");
                    win = true;
                    return;
                }
                System.out.println(".........................");
                System.out.println("Numbers doesn't match... Try again!");
                result[1] = player1.getGameRandomNumber();
                result[2] = player2.getGameRandomNumber();
                System.out.println(player1.name + " new number " + player1.number);
                System.out.println(player2.name + " new number " + player2.number);
                System.out.println(result[0] + " " + result[1] + " " + result[2]);
            }
        }
    }

}


    


