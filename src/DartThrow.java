/**
 * File: DartThrow.java
 * --------------------
 *
 * The DartThrow keeps track of the following pieces of data
 * about a dart_throw: x coordinate, y coordinate.
 *
 * This information is entirely private to the class.
 *
 * Clients can obtain information whether the dart is (falls) in circle
 * by using the isInCircle method defined by the class.
 *
 * INSTRUCTIONS:
 * You can model the process of throwing a dart randomly at the square by
 * generating two random numbers, x and y, each of which lies between –1 and 1.
 * This (x, y) point always lies somewhere inside the square. The point (x, y) lies
 * inside the circle if⎯
 * x^2 + y^2 < 1
 * If you perform this simulation many times and compute the fraction of darts
 * that fall within the circle, the result will be somewhere in the neighborhood of
 * π/4.
 * Write a program that simulates throwing 10,000 darts and then uses the
 * simulation technique described in this exercise to generate and display an
 * approximate value of π. Don’t worry if your answer is correct only in the first
 * few digits. The strategy used in this problem is not particularly accurate, even
 * though it occasionally proves useful as a technique for making rough
 * approximations. In mathematics, this technique is called Monte Carlo
 * integration, after the gambling center that is the capital of Monaco.
 * */

import acm.program.*;

public class DartThrow extends ConsoleProgram {

    /**
     * Creates new DartThrow object with the specified x and y coordinates
     * @param x_ horizontal coordinate of this dart throw
     * @param y_ vertical coordinate of this dart throw
      */
    public DartThrow(double x_, double y_) {
        x = x_;
        y = y_;
        if(x * x + y * y < 1) {
            inCircleCounter++;
        }
    }

    /**
     * Gets the number of darts that fell inside the target circle,
     *   which is a class variable.
     * @return number of darts that fell inside the target circle
     */
    public int getInCircleCounter() {
        return inCircleCounter;
    }

    /* class variables */
    private static int inCircleCounter;

    /* instance variables */
    private double x;
    private double y;
}

