package person;

public class PersonProgram {
    public static void main(String[] args) {

        Person p1 = new Person("Peter", 15);
        Person p2 = new Person("Ivan", 23);

        System.out.println(Person.compare(p1, p2));
    }
}
