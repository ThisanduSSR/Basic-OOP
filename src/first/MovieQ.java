package first;

public class MovieQ {
    private String title;
    private String category;
    private DirectorQ director;
    private int numAward;

    public MovieQ(String title, String category, DirectorQ director){
        this.title = title;
        this.category = category;
        this.director = director;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory() {
        return category;
    }
    public DirectorQ getDirector() {
        return director;
    }
    public void setNumAward(int numAward){
        this.numAward = numAward;
    }
    public int getNumAward() {
        return numAward;
    }
    @Override
    public String toString() {
        return title+" "+category+" "+director+" "+numAward;
    }
}
