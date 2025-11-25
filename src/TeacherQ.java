public class TeacherQ extends PersonQ{
    private int salary;
    private String subject;

    public TeacherQ(String myName, int myAge, String subject, int salary, String myGender) {
        super(myName,myAge,myGender);
        this.subject = subject;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public String getSubject(){
        return subject;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    @Override
    public String toString() {
        return super.toString()+", subject:"+ subject+", salary:"+salary;
    }
}
