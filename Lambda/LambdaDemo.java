package Lambda;

/*
* Guitar
* (Declarative)
* - give me the 6 strings
* - give me the body
* - give me the arm
* ...
*
* (Imperative)
* - create for loop 6 times
* ...
*
* Lambda: A function without a name
*
* */
public class LambdaDemo {

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        int sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        LambdaDemo test = new LambdaDemo();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(test.operate(10, 20, addition));
        System.out.println(test.operate(10, 20, subtraction));
        System.out.println(test.operate(10, 20, multiplication));
    }

}
