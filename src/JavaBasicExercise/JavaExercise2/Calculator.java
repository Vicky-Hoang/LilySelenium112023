package JavaBasicExercise.JavaExercise2;

public class Calculator {
    int a;
    int b;
    double c;
    double d;

    //Create method to calculate sum of two integer
    public int sumMethod(int a, int b){
        return a + b;
    }

    //Create method to multiple of two integer
    public double productMethod(double c, double d){
        return c*d;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();
        //create new variable and set value to store in new variable
        int sum = calculator.sumMethod(7,9);
        double product = calculator.productMethod(12.45, 23.56);

        //Print the value of method
        System.out.println("The sum of two integer a and b is " + sum);
        System.out.println("The product of two double c and d is " + product);
    }
}
