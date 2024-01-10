package JavaBasicExercise.JavaExercise4;

public class EvenNumber {

    public static void main(String[] args) {
        //Create the For loop to print the numbers even from 0-50
        for ( int i = 0; i <= 50; i = i + 2){
            System.out.println("Print the even number from 0-50 is : " + i);
        }

        //Create an Array to store all even numbers from 0-50
        int arr[] = new int[26];
        int number = 0;
        for(int x = 0; x <= 50; x = x+ 2) {
            //Store even number to array
            arr[number] = x;
            number++;
        }

        // Iterate through the array and print the value
            System.out.println("________Printing the even number_______");
            for (int evenNum : arr){
                System.out.println(evenNum);
            }
        }



}
