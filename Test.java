
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
    //  Body Mass Index Calculator
    //
        int height,weight;
        Scanner bob = new Scanner(System.in);

        System.out.print("weight?");
        weight = bob.nextInt();

        System.out.print("height?");
        height = bob.nextInt();

        double Body_Mass_Index = weight/ (height*height);
        System.out.println("Body Mass Index:"+ Body_Mass_Index);



    } }