package io;


public class MusicPlayer {
    // variáveis
    private String name;
    private String author;
    public void setMusicI(int musicI) {
        this.musicI = musicI;
    }

    int musicI;


    // construtor
    public MusicPlayer (String Name, String author, int musicI) {
    }
        public MusicPlayer(){

        }
        public void setName (String name) {
            this.name = name;
        }

        public void setAuthor (String author){
            this.author = author;
        }

        public void setMusic (int musicI) {
            this.musicI = musicI;
        }

        public String playMusic1 () {
            this.name = "Mula Preta";
            this.author = "Penabranca e Xavantinho";
            this.musicI = 1;
            return "Você está ouvindo " + this.name + " de " + this.author;
        }
        public String playMusic2 () {
            this.name = "Estradão da vida";
            this.author = "Tonico e Tinoco";
            this.musicI = 2;
            return "Você está ouvindo " + this.name + " de " + this.author;
        }
        public String playMusic3 () {
            this.name = "Caminhoneiro";
            this.author = "Trio parada dura";
            this.musicI = 3;
            return "Você está ouvindo " + this.name + " de " + this.author;
        }




        }

}




