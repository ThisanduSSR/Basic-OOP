public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void displayFName() {
        System.out.println("First Name is:"+firstName);
        System.out.println("Last Name is:"+ lastName);
    }
    public void displayAge() {
        System.out.println("Age is:"+ age);
    }
}
