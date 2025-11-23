public class PersonQ {
    private String myName;
    private int myAge;
    private String myGender;

    public PersonQ(String myName, int myAge, String myGender){
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }
    public String getMyName() {
        return myName;
    }
    public int getMyAge() {
        return myAge;
    }
    public String getMyGender() {
        return myGender;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

}
