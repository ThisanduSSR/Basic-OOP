public class TestQ {
    public static void mian(String[] args) {
        PersonQ jack = new PersonQ("Jack Brooke",27, "M");
        System.out.println(jack);

        StudentQ beth = new StudentQ("Elizabeth", 16, "F",122223);
        System.out.println(beth);

        TeacherQ sam = new TeacherQ("Sam",34,"computer Science ",17000,"M");
        System.out.println(sam);
    }
}
