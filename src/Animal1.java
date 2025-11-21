abstract class Animal1 {
    public abstract void east();
    public abstract void sound();
}
public class Dog extends Animal1{
    public void sound() {
        System.out.println("Dog is barking ");
    }
}

public class Cat extends Animal1{
    public void eat(){
        System.out.println("Cat is eating fish");
    }
}