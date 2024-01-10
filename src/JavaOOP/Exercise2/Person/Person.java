package JavaOOP.Exercise2.Person;

public class Person {
    private String name;
    private  int age;
    private String gender;
    private String address;
    private String phone;

    //Create constructor of Person class
    public Person(String name, int age, String gender, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    //Create get method for all variable
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }

}
