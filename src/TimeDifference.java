import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {

        //  declaration global variables
        Scanner se = new Scanner(System.in);
        int timeHomeDestination, timeHomeMidnightDestination = 24;

        // ask the difference time
        System.out.println("Please enter the difference time between your home and your destination : ");
        timeHomeDestination = se.nextInt();


        if((timeHomeDestination < -24) || (timeHomeDestination > 24)){ // check validity of input
            System.out.println("It's impossible, check out again destination's hour");
        }else {

            // find the hour when it's midnight in your destination
            if(timeHomeDestination < 0){
                timeHomeMidnightDestination += timeHomeDestination;
            }else {
                timeHomeMidnightDestination = timeHomeDestination;
            }
        }

        // display the result
        System.out.println("It will be "+timeHomeMidnightDestination+":00 when It is midnight at your home.");

    }

}
