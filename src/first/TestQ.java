package first;

public class TestQ {
    public static void main(String[] args){
        DateQ dob = new DateQ(16,8,2008);
        DirectorQ director = new DirectorQ("James", "Cameron");
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director);
        System.out.println("Director name:"+ director.getName());
        System.out.println("Director surname:"+director.getSurname());
        System.out.println("Director dob:"+director.getDob().getDate());
        System.out.println("Director number of movies:"+director.getNumDirectedMovie());
    }

}
