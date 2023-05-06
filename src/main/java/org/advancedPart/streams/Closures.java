package org.advancedPart.streams;

public class Closures {
    public static void main(String[] args) {

        Counter counter = createCounter();
        System.out.println(counter.count());
    }


    //you cannot modify any local variables from inside of anonymous classes or lambda expressions
    //you have to find way to avoid modifying variables:
    // - avoid using lambda
    // - move variable to field
    // - use object that holds this value so you dont need to change variable value
    //      (variable value is reference to that object now)
/*
    public static Counter createCounter() {
        int value = 0;
        Counter counter = new Counter() {
            @Override
            public int count() {
                String text = "abcadfgdfgadfgdfga";
                for (char letter : text.toCharArray()) {
                    if (letter == 'a') {
                      value++;
                    }
                }
                return value;
            }
        };
        return counter;
    }
*/

    public static Counter createCounter() {
        final IntegerHolder holder = new IntegerHolder();

        Counter counter = new Counter() {
            @Override
            public int count() {
                String text = "abcadfgdfgadfgdfga";
                for (char letter : text.toCharArray()) {
                    if (letter == 'a') {
                        holder.value++;
                    }
                }

                return holder.value;
            }
        };
        return counter;
    }
}

interface Counter{

    static  final   String text = "asd";

    int count();
}

class IntegerHolder{
    int value = 0;
}
