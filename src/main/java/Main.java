/**
 * snake_case
 * PascalCase
 * camelCase
 * kebab-case
 */

public class Main {

    private static final int finalVariable = 300;
    private static int privateSample = 1000;//visible only within Main clas
    int packageProtectedSample; //visible within package of Main class
    protected int ProtectedSample; //visible fot this class and classes that EXTEND this class
    public int publicSample; //visible everywhere

    public static void main(String[] args) {
        int privateSample = 2000; //narrowed context, this variable is visible only in main method
        System.out.println("Hello from src directory!");
        System.out.println("Use variable : " + privateSample);
        System.out.println(finalVariable);
        anotherMethod();
        //finalVariable = 200; modification of final variable is forbidden, code will not even compile
        int localMainVariable = 200;
    }

    public static void anotherMethod() {
        System.out.println("Original private sample in use : " + privateSample);
    }

    public void nonStaticMethod() {
        publicSample = 2;
    }
}



