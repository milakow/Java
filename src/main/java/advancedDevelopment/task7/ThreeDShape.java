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
public abstract class ThreeDShape extends Shape implements Fillable{

    public abstract double calculateVolume();
}
