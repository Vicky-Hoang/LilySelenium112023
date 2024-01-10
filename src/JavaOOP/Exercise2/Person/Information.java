package JavaOOP.Exercise2.Person;

public class Information {

    public static void main(String[] args) {
        Person person = new Person("Hana", 38, "Female", "0984968869");
        System.out.println(person.getName() +", " +  person.getAge() + ", " + person.getGender() + ", " + person.getPhone());
    }
}
