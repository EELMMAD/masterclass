package se.udemy.elmira.primitiveTypes;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyDoubleValue = " + myFloatValue);
        System.out.println("MyFloutValue = " + myDoubleValue);


        //convert a given number of pounds to kilograms
        //Steps:
        //1.Create a variable with the appropriate type to store the number of pounds to be converted
        //kilograms.
        //2.Calculate the result the number of kilograms based on the content of the variable above and
        // store  the result in a 2nd appropriate variable.
        //3.Print out the result.

        //Hint:  1 pound is equal to 0.45359237 of a kilogram.

        double numberOfPound = 200;
        double convertedKilogram = numberOfPound * 0.45359237;
        System.out.println("convertedKilogram = " + convertedKilogram);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
