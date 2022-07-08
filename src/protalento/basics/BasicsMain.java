package protalento.basics;

import protalento.basics.heritance.example1.Animal;
import protalento.basics.heritance.example1.Cat;
import protalento.basics.heritance.example1.Dog;
import protalento.basics.heritance.example2.ChessPiece;
import protalento.basics.heritance.example2.Horse;
import protalento.basics.heritance.example2.Pawn;
import protalento.basics.heritance.example2.Queen;
import protalento.basics.interfaces.CreditPayment;
import protalento.basics.interfaces.DebitPayment;
import protalento.basics.interfaces.IPayments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Características clave de JAVA:
    1. Herencia
    2. Cohesión
    3. Abstracción: "qué hace" en lugar de "cómo lo hace". Concepto de caja negra
    4. Polimorfismo: diferentes "formas" de un objeto el cual puede responder de manera distinta
    5. Acoplamiento
    6. Encapsulamiento
    7. Lenguaje altamente tipado
*/
public class BasicsMain {

    public static void main(String[] args) {
        Animal dog = new Dog("Rufus", 5);
        Animal cat = new Cat("Fluffy", 4);

        List<Animal> animals = List.of(dog, cat);
        animals.forEach(Animal::makeSound);

        List<Animal> list1 = new ArrayList<>();
        List<Animal> list2 = new LinkedList<>();

        List<ChessPiece> chessBoard = List.of(new Pawn(), new Horse(), new Queen());

        chessBoard.forEach(chessPiece -> {
            chessPiece.moveForward();
            chessPiece.retrievePosition();
        });

        IPayments payments = new DebitPayment();
        System.out.println(payments.makePayment());

        IPayments secondPayment = new CreditPayment();
        System.out.println(secondPayment.makePayment());

    }

}
