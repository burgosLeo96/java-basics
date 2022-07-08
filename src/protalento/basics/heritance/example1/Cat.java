package protalento.basics.heritance.example1;

public final class Cat extends Animal {

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
