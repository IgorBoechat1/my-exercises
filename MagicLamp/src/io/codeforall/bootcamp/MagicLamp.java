package io.codeforall.bootcamp;

public class MagicLamp {

    public int counter;
    public int maxGenie;

    public MagicLamp(int maxGenie) {
        this.maxGenie = maxGenie;
        this.counter = counter;

    }

    public Genie lampRub() {
        counter++;
        if (counter > maxGenie) {
            System.out.println("Youve got a DEMON!");
            return new Demon();
        }
        if (counter % 2 == 0) {
            System.out.println("Youve got a Friendly genie");
            return new FriendlyG();
        }

         else {
            System.out.println("Youve got a Grumpy genie");
            return new GrumpyG();

        }
    }
}




