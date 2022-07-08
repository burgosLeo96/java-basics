package protalento.basics.heritance.example1;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

}
