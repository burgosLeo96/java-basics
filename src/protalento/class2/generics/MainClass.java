package protalento.class2.generics;

import protalento.basics.heritance.example1.Animal;
import protalento.basics.heritance.example1.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<String> myList = List.of("string1", "string2");

        GenericExample<String, String> myGeneric = new GenericExample<>("First Generic", "Second Generic");

        /*System.out.println(myGeneric.getGenericAttribute());
        System.out.println(myGeneric.getAnotherGenericAttribute());*/

        GenericExample<String, Integer> myGeneric2 = new GenericExample<>("Another Generic", 2);

        List<GenericExample> myGenericsList = List.of(myGeneric, myGeneric2);

        myGenericsList.forEach(item -> {
            System.out.println(item.getGenericAttribute());
            System.out.println(item.getAnotherGenericAttribute());
        });
    }

}
