package JavaOOP.Exercise1;

public class Employee1 {
    private  String name;
    private int age;
    private String address;

    //Create a constructor

    public Employee1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Create method get for all variable
    public String getName(){
        return name;
    }
    public void setName(String address){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int value){
        this.age = value;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Create method to show employee info
    public void empShowInfo(){
        System.out.println("My name is " + name + ", Im " + age + " years old" + ", I lived in " + address);
    }

}
