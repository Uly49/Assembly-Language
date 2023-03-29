/*
Ulysses Palomar
CSCI 245 - 001
Homework 4
This program is to help answer questions from worksheet
 */

//import java.lang.Math;

public class HW4 {
    public static void main(String[] args) {

        //Question 2 & 3
        int x = 2147483640;
        System.out.println(x);
        while (x > 0) {
            x++;
            System.out.println(x);
        }//End int while

        //Question 4
        byte y = 120;
        System.out.println(y);
        while (y > 0) {
            y++;
            System.out.println(y);
        }//End positive byte while

        //Question 5
        byte z = -120;
        System.out.println(z);
        while (z < 0) {
            z--;
            System.out.println(z);
        }//End negative byte while

        //Question 6
        double a = 12.4567898765434567;
        double b = .732674868;
        double c = 4.74983783288331;
        System.out.println("Variable a holds the double value: " + a);
        System.out.println("Variable b holds the double value: " + b);
        System.out.println("Variable c holds the double value: " + c);
        float a2 = (float) a;
        float b2 = (float) b;
        float c2 = (float) c;
        System.out.println("After typecasting a to a float, the value is: " + a2);
        System.out.println("After typecasting b to a float, the value is: " + b2);
        System.out.println("After typecasting c to a float, the value is: " + c2);

        //Question 7
        float d = 1000000;
        System.out.println(d);
        for (int i = 0; i < 50; i++) {
            d *= 10000;
            System.out.println(d);
        }//End float multiplication for loop
        float e = 5.75f;
        System.out.println(e);
        for (int i = 0; i < 50; i++) {
            e /= 10000;
            System.out.println(e);
        }//End float division for loop

        //Question 8
        double f = 0.33333333;
        System.out.println(f);
        for (int i = 0; i < 100000; i++) {
            f += .33333333;
        }//End double addition for loop
        System.out.println("After adding .333,333,33 to .333,333,33 100,000 times, the sum is: " + f);
        double g = .33333333;
        System.out.println(g);
        g *= 100000;
        System.out.println("After multiplying .333,333,33 by 100,000, the product is: " + g);

        //Question 9
        double h = 0.33333333;
        System.out.println(h);
        for (int i = 0; i < 10000000; i++) {
            h += .33333333;
        }//End double addition for loop
        System.out.println("After adding .333,333,33 to .333,333,33 10,000,000 times, the sum is: " + h);
        double j = .33333333;
        System.out.println(j);
        j *= 10000000;
        System.out.println("After multiplying .333,333,33 by 10,000,000, the product is: " + j);

    }//End main
}//End HW4
