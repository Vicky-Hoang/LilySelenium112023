package JavaBasicExercise.JavaExercise3;

public class CompareVariables {
    int number = 100;

    //Create a method using variable
    public void compare(int n){
        if(n == 100){
            System.out.println("The result is n == 100");
        } else if ( n< 100) {
            System.out.println("The result is n < 100");
        }else
            System.out.println("The result is n > 100 ");
    }

    public static void main(String[] args) {
        // Create an instance of CompareVariables
        CompareVariables compare1 = new CompareVariables();

        //Declare variable to use operator
        int a = 10;
        int b = 25;
        int c = 30;
        System.out.println("_____________________________");
        System.out.println("The result of Operation");
        System.out.println("The result of operator if compared a==b is " +  ( a == b));
        System.out.println("The result of operator if compared a==b is " +  ( a != b));
        System.out.println("The result of operator if compared (a < b && b < c) is " +  ( a < b && b < c));
        System.out.println("The result of operator if compared (a > b || b < c) is " +  ( a > b || b < c));

        //Print the value of compare method
        System.out.println("_________________________");
        System.out.println("Print the result of compare method");
        compare1.compare(90);
    }
}
