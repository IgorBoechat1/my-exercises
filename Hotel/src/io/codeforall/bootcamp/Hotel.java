package io.codeforall.bootcamp;

public class Hotel {


    private int[] rooms = {1, 2, 3, 4};
    private Room room;

    public Hotel() {
        this.room = room;
    }

    //CHECK IN
    public void checkIn() {
        for (int i = 0; i < rooms.length; i++) {
            if (room.isAvailable()) {
                System.out.println("We have the room " + rooms[i] + " available");

                rooms[i] = rooms.length - 1;
                System.out.println("Ainda tenho " + rooms[i] + " quartos");


            }
        }


    }

}


