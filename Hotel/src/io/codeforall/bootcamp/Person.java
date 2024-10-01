package io.codeforall.bootcamp;

public class Person {

    private String name;
    private String checkIn;
    private String checkOut;

    public Person(Hotel hotel, Room room){

    }
/*
    public Person(String checkIn, String checkOut, String name) {
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }
*/

    public Person(String name){
        this.checkIn = name;
    }
}
