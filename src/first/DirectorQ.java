package first;

public class DirectorQ {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private int dob;

    public DirectorQ(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }
    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }
    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }
    public int getDob(){
        return dob;
    }
    @Override
    public String toString() {
        return name+ " "+ surname+" "+numDirectedMovie+" "+dob;
    }
}

