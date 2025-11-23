public class StudentQ extends PersonQ{
    private int idNo;
    private int fee;
    private int grade;

    public StudentQ(String myName,int myAge, String myGender, int idNo) {
        super(myName,myAge,myGender);
        this.idNo = idNo;
    }

}
