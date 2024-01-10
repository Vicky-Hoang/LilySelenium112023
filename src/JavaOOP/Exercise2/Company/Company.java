package JavaOOP.Exercise2.Company;

import JavaOOP.Exercise2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Anna", 27, "Female","");
        System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getGender());
    }
}
