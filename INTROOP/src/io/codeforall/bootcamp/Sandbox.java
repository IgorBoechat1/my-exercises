package io.codeforall.bootcamp;

import io.MusicPlayer;

import javax.lang.model.element.Name;

public class Sandbox {
    public void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        int randomMusic = (int) (Math.random() * 3);



        if (randomMusic == 0) {
            System.out.println(randomMusic + "  " + player.playMusic1());
        } else if (randomMusic == 1) {
            System.out.println(randomMusic + "  " + player.playMusic2());
        } else if (randomMusic == 2) {
            System.out.println(randomMusic + "  " + player.playMusic3());
        }

       MusicPlayer player1 = new MusicPlayer("Charlie Brown", "Céu azul",  4 );
            System.out.println();

    }
}





