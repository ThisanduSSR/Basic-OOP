public class TeacherQ extends PersonQ{
    private int salary;
    private String subject;

    public TeacherQ(String myName, int myAge, String subject, int salary) {
        super(myName,myAge);
        this.subject = subject;
        this.salary = salary;
    }


}
