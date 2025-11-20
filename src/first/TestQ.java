package first;

public class TestQ {
    public static void main(String[] args){
        DateQ dob = new DateQ(16,8,2008);
        DirectorQ director = new DirectorQ("James", "Cameron");
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director);
    }

}
