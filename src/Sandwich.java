/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name: Christopher Hammer
 * Description: Activity 01 - Sandwich
 */



/*A sandwich is defined by a name, number of calories (integer is fine), and price. Users should be able to create a sandwich given its name, number of calories, and price. If informed number of calories or price is negative, make sure those values are initialized to zero. Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250, false otherwise.*/

public class Sandwich {

    private String name;
    private int    calories;
    private double price;
    private final int INIT_CAL = 0;
    private final double INIT_PRICE = 0.00;
    private final int HIGH_CAL = 250;

    public Sandwich(String name, int calories, double price){

        this.name = name;
        this.calories = calories;
        this.price = price;

        if(calories < 0){
            this.calories = INIT_CAL;
        }
        if(price < 0){
            this.price = INIT_PRICE;
        }
    }

    private boolean isHealthy() {
        return calories < HIGH_CAL;
    }

    @Override
    public String toString() {
        return "Your Sandwich" + "\n" +
                "Type: " + name + "\n" +
                "healthy: " + isHealthy()  + "\n" +
                "price: " + price ;
    }

    public static void main(String[] args) {

        String turkey = "Turkey";

        Sandwich s1 = new Sandwich(turkey,300,3.00);

        System.out.println(s1);

    }
}