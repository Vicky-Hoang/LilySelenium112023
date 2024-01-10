package JavaBasicExercise.JavaExercise1;

public class Students {

    public void studInfo() {
        String address = "Hanoi"; // local variable
        System.out.println("_____________________");
        System.out.println("Printing the value of local variable");
        System.out.println("The student address is " + address);
    }

    //Create instance variable
    public String stuName;

    public Students(String name) {
        this.stuName = name;
    }

    //Create method to show value of instance variable
    public void showStuName() {
        System.out.println("______________________");
        System.out.println("Printing the value of instance variable");
        System.out.println("My student name is " + stuName);
    }

    //Create static variable
    public static int age = 29;


    public static void main(String[] args) {
        Students stuObj = new Students("Lily");
        stuObj.studInfo();//Print local variable
        stuObj.showStuName();
        System.out.println("The student age is" + age);// Print static value variable

        //Call static variable from another class
        System.out.println("_______________________");
        System.out.println("Print value of static variable from another class");
        System.out.println("The student score is " + Information.score);
        System.out.println("The student grade is " + Information.grade);
        System.out.println("The student title is " + Information.title);
    }
}
