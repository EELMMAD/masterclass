package se.udemy.elmira.expressionsStatmentsCodeblockMethods.codingExerciese;

public class SpeedConverter {
    public static void main(String[] args) {
        long miles = toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        printConversion(10.5);
    }
    //1.write a method called toMilesPerHour that has one parameter of type double with
    // the name kilometersPerHour. This method needs to return the rounded value of the
    // calculation of type long.
    //If the parameter toMilesPerHour is less than 0, the method toMilesPerHour needs to return -1
    // to indicate an invalid value.
    // Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    //2.Write another method called printConversion with 1 parameter of type double with the name
    // kilometersPerHour. This method should not return anything(void) and it needs to calculate
    // milesPerHour from the kilometersPerHour parameter.
    //Then it needs to print a message in the format "XX km/h = YY mi/h".
    //XX represents the original value kilometersPerHour.
    //YY represents the rounded milePerHour from the kilometersPerHour parameter.
    //If the parameter kilometersPerHour is < 0 then print the text "Invalid value".

    //TIP: In the method print conversation, call the method toMilesPerHour instead of
    // duplicating the code.
    //NOTE: 1 mile per hour is 1.609 kilometers per hour.

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
