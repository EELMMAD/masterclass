package se.udemy.elmira.primitiveTypes;

public class TypesChallenge {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        int myTotal = myByte + myShort + myInt;
        long myLong = 50000L+ (10L * myTotal);
        System.out.println(myLong);

        short myShortTotal = (short)(1000 + 10 * (myTotal));
        System.out.println(myShortTotal);
    }
}
