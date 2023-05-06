package org.advancedPart.anonymousClasses.lambdaExpression;

/**
 * Create an Equation interface with an execute(int,int) method that returns an int.
 * Use an anonymous class to implement an addition and subtraction equation.
 */



//LAMBDA EXPRESSION:
// get rid of @Override
// we don't need to point on interface Equation. it knows it from the context
// {} not needed to say it is a class
// no need to mention the name of the method because there is only one method
// we don't need to specify types of our variables
// WHAT WE NEED : parameters and expression of what we want to return statement;

public class SimpleCalculatorDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(
            () -> {
                System.out.println("hi");
            }
        );

        //simpler version
        Thread thread2 = new Thread(() -> System.out.println("hello"));
//        Equation equation = new Equation() {
//            @Override
//            public int execute(int number, int number2) {
//                return number + number2;
//            }
//        };
//
        Equation equation = (number, number2) -> number + number2;

        Calculator calculator = new Calculator(5, 3, equation);
        System.out.println(calculator.calculate());
//        Equation equation1 = new Equation() {
//            @Override
//            public int execute(int number, int number2) {
//                return number - number2;
//            }
//        };
//        calculator.setEquation(equation1);
//        System.out.println(calculator.calculate());

//        Equation equation1 = (int number, int number2) -> {
//                return number - number2;
//            };

        Equation equation1 = (number, number2) -> number - number2;

        calculator.setEquation(equation1);
        System.out.println(calculator.calculate());

        //Lambda expression is simplification of the code when try too quickly implement interface with one abstract method
        //Functional interface is interface that has exactly one abstract method

    }

}

class Calculator{
    private int num1;
    private int num2;
    private Equation equation;

    public Calculator(int num1, int num2, Equation equation) {
        this.num1 = num1;
        this.num2 = num2;
        this.equation = equation;
    }

    public int calculate(){
        return equation.execute(num1, num2);
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }
}
interface Equation{
    int execute(int number, int number2);
}
