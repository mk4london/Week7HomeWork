package homeWorkWeek7;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname("");//firstname set to empty string
        person.setLastname(""); // last name set ro
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen =" + person.teen());
        person.setFirstname("john");
        person.setAge(18);
        System.out.println("fullName =" + person.getFullName());
        System.out.println("teen = " + person.teen());
        person.setLastname("Smith");
        System.out.println("fullName = " + person.getFullName());

    }
}