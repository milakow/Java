package advancedDevelopment.task9;

public class Demo {

    public static void main(String[] args) {
        Joiner joiner = new Joiner<>("-");
        System.out.println(joiner.join(1,2,3,4));


    }

}
