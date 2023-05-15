package advancedDevelopment.task7;

/**
 * Create an abstract class named 3DShape extending the Shape class from the previous exercise.
 * Add an additional abstract method named calculateVolume().
 * Create classes named Cone and Cube extending the 3DShape class, respectively implementing the abstract methods. Test the correctness of the implementation.
 */

/**
 * Create an interface named Fillable with a method fill().
 * Implement this method in the 3DShape class from the previous task or separately in the Cone and Qube classes.
 * The fill() method should take an int parameter and return true/false if water was added successfully, check if, after filling the shape with water:
 *          • It will overflow if too much water is poured into the shape.
 *          • The shape will be filled with water up to the brim if the amount of water is just enough.
 *          • It will be under-filled if too little water is poured.
 * For each situation, the method should print a message to the console about the current state. Use the calculateVolume() method to determine the capacity of the shape.
 */
public class Cone extends ThreeDShape {

    private final int baseRadius;

    private final int coneHeight;

    private final double generatrix;

    private double volume_of_water;

    public Cone(int baseRadius, int coneHeight, double generatrix) {
        this.baseRadius = baseRadius;
        this.coneHeight = coneHeight;
        this.generatrix = generatrix;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(baseRadius, 2) * coneHeight;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(baseRadius, 2) + Math.PI * baseRadius * generatrix;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public boolean fill(int parameter) {
        volume_of_water += parameter;
        if (volume_of_water < calculateVolume()) {
            System.out.println("Shape remain under-filled");
            return true;
        } else if (volume_of_water == calculateVolume()) {
            System.out.println("Shape is filled with water up to the brim");
            return true;
        } else {
            System.out.println("The water overflow!!!");
            return false;

        }
    }

    public double getVolume_of_water() {
        return volume_of_water;
    }

    public void setVolume_of_water(double volumeOfWater) {
        this.volume_of_water = volume_of_water;
    }
}
