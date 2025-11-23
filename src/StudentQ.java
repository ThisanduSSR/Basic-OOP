public class StudentQ extends PersonQ{
    private int idNo;
    private int fee;
    private int grade;

    public StudentQ(String myName,int myAge, String myGender, int idNo) {
        super(myName,myAge,myGender);
        this.idNo = idNo;
    }
    public int getIdNo() {
        return idNo;
    }
    public int getFee() {
        return fee;
    }
    public int getGrade() {
        return grade;
    }
    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
    public void setFee(int fee){
        this.fee = fee;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public String tString(){
        return super.getMyName()+" "+super.getMyAge()+" "+super.getMyGender();
    }

}
