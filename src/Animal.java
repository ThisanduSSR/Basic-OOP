abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof woof");
    }
}
class cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow meow");
    }
}
