package JavaBasicExercise.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberArrayList {

    public static void main(String[] args) {

        System.out.println("_______Print the even number from 0-50__________");
        //Create the for loop the print the even number from 0-50
        for (int i = 0; i <= 50; i = i + 2) {
            System.out.println("Print the even number from 0-50 is: " + i);
        }

        //Using ArrayList to store all even number

        System.out.println("______Using arrayList________");
        //Create array list
        List<Integer> evenNumberList = new ArrayList<Integer>(26);
        for ( int i = 0; i <= 50; i = i+ 2){
            evenNumberList.add(i);
        }

        //Print the even number from arraylist
        System.out.println("_____Print the even number from ArrayList");
        for (int evenNo : evenNumberList){
            System.out.println("\t" + evenNo + "\n");
        }
    }
}
