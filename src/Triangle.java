import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){

        // declaration global variables
        Scanner se = new Scanner(System.in);
        double firstAngle, secondAngle, thirdAngle, sumAngles;

        // ask the values of angles
        System.out.println("Please, enter the values of triangle :");

        // retrieve the first value
        System.out.println("First angle :");
        firstAngle = se.nextDouble();

        // retrieve the second value
        System.out.println("Second angle :");
        secondAngle = se.nextDouble();

        // retrieve the third value
        System.out.println("Third angle :");
        thirdAngle = se.nextDouble();

        // check if values are for a triangle
        sumAngles = thirdAngle + secondAngle + firstAngle;
        if (sumAngles != 180.0)
            System.out.println("It is not a valid triangle.");
        else
            System.out.println("It is a valid triangle.");

    }
}
