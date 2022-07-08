package protalento.basics.heritance.example1;

public class Dog extends Animal {

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("wouf!");
    }
}
