import java.util.Random;

/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - Die
 */

/*
In this assignment you are asked to design a simple class to model a die, according to the following
specifications. A die is defined by its number of sides (at least 2) and a value that keeps the die’s
current value (set to 1 upon initialization). Users should be able to create a die given its number
of sides. If the informed number of sides is less than 2, it should be set to 2.

Users should also be able to create a die without informing its number of sides (in that case, the
number of sides should be set to 6). Remember, the current value of a die should always be set to
1 upon object instantiation. Create a method called “getValue” that returns the die's current value.
Also, define a method called “roll” to randomly pick another value for the die, based of course on
the number of sides.

Write a DieDriver program to illustrate how the Die class can be used. This program should create an
8-sided die. After showing the information about the die, the program should roll it 10 times, displaying
its current value at each iteration. Below is an example output for your reference.

-Mota
 */

public class Die extends DieDriver {

    private static final int MIN_SIDES     = 2;
    private static final int DEFAULT_SIDES = 6;
    private static final int INIT_VALUE    = 1;
    private  int sides;
    private int value;

    public Die(int sides) {

        if(sides < MIN_SIDES){
            this.sides = MIN_SIDES;
        }else{
            this.sides = sides;
        }
    }

    public Die() {
        value = INIT_VALUE;
        sides = DEFAULT_SIDES;
    }

    public int getValue() {
        if(value <= INIT_VALUE ){
            value = INIT_VALUE;
        }
        return value;
    }

    // Rolls the dice and updates the value variable
    public void roll() {
        value = (int) (Math.random() * sides + 1);
    }

    @Override
    public String toString() {
        return "";
    }
}