package com.teksystems;

public class Main {

    public static void main(String[] args) {
	    SumTwoInts();
        SumTwoDoubles();
        SumIntAndDouble();
        DivideTwoInts();
        DivideTwoDoubles();
        DivideAndCast();
        Constant();
    }

    public static void SumTwoInts () {
        // Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void SumTwoDoubles () {
        // Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.
        double a = 5.9;
        double b = 3.4;
        double sum = a + b;
        System.out.println(sum);
    }

    public static void SumIntAndDouble () {
        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result.
        // What variable type must the sum be? - Double
        int a = 3;
        double b = 5.7;
        double sum = a + b;
        System.out.println(sum);
    }

    public static void DivideTwoInts () {
        // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable.
        // Print out the result.
        int a = 20;
        int b = 5;
        int dividend = a / b;
        System.out.println(dividend);
        // Now change the larger number to a decimal.
        // What happens? What corrections are needed? - The dividend needs to be a double
        double c = 20.5;
        int d = 4;
        double dividend2 = c / d;
        System.out.println(dividend2);
    }

    public static void DivideTwoDoubles () {
        // Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
        // Assign the result to a variable.
        // Print out the result.
        double a = 33.4;
        double b = 4.9;
        double dividend = a / b;
        System.out.println(dividend);
        // Now, cast the result to an integer.
        // Print out the result again.
        int value = (int)dividend;
        System.out.println(value);
    }

    public static void DivideAndCast () {
        // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(q);
        // Now, cast y to a double and assign to q.
        // Print q again.
        double y2 = (double)y;
        double q2 = y2 / x;
        System.out.println(q2);
    }

    public static void Constant () {
        // Write a program that declares a named constant and uses it in a calculation.
        // Print the result.

    }

    public static void Cafe () {
        // Write a program where you create 3 variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product.
        // Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
        // Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to 2 decimal places.
    }


}
