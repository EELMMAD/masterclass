package se.udemy.elmira.operatorsOPerandsAndExpressions;

public class OperatorChallenge {
    public static void main(String[] args) {
        //1.create a double value with a value of 20;
        //2. create a second variable of type double with the value of 80;
        double firstVariable =  20.00d;
        double secondVariable = 80.00d;

        //3. add both numbers together and multiply by 100.00;
        double myValueTotal = (firstVariable + secondVariable) * 100.00d;
        System.out.println("MyValueTotal = " + myValueTotal);

        //4.Use a reminder operator to figure out what the reminder from the result
        // of the operation in step 3 and 40.00.
        //We use the modulus or reminder operator on ints in the course, but we can use it
        //on a double.

        double theReminder = myValueTotal % 40.00d;
        System.out.println("TheReminder = " + theReminder);

        //5.Create a boolean variable that assigns the value true if the reminder in #4 is 0,
        //or false if it is not zero.

        boolean isNoRemainder = (theReminder == 0) ? true : false;

        //6.Output the boolean variable
        System.out.println("IsNoRemainder = " + isNoRemainder);

        //7. write an if-then statement that displays a message "Got some reminder" if the boolean is
        //in step 5 is not true. Do not surprised  if you see output for the step, where yot might expect
        //it not to show.

        if(!isNoRemainder){
            System.out.println("Got some reminder");
        }


    }
}
