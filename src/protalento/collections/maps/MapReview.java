package protalento.collections.maps;

import protalento.basics.heritance.example1.Animal;
import protalento.basics.heritance.example1.Cat;
import protalento.basics.heritance.example1.Dog;

import java.util.*;

public class MapReview {

    public static void main(String[] args) {
        Map<String, Animal> animalsMap = new HashMap<>();
        animalsMap.put("Dog", new Dog("fluffy", 5));
        animalsMap.put("Cat", new Cat("whisks", 3));

        Map<String, Animal> animalsLinkedHashMap = new LinkedHashMap<>();
        animalsLinkedHashMap.put("MyDog", new Dog("kovu", 10));
        animalsLinkedHashMap.put("MyCat", new Cat("lion", 5));

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Leonard", "Burgos");
        miMapa.put("Richard", "Niño");
        miMapa.put("Daniela", "Montaño");

        System.out.println(miMapa.get("Leonard"));
        System.out.println(miMapa.get("Daniela"));
        System.out.println(miMapa.get("Richard"));

        miMapa.put("Leonard", "Jimenez");

        System.out.println(miMapa.get("Leonard"));

        /*
        *
        * 1. Definir una clase abstracta (Instrumentos)
        * 2. Definir mínimo 2 clases que extiendan de la clase abstracta
        * 3. Lista de la clase abstracta que crearon. Añadir elementos a lista
        * 4. Iterar sobre la lista e imprimir el mensaje de cada una de las clases hijas
        * 5. Crear un mapa donde la llave sea una cadena (instrumentos de cuerda, instrumentos de viento) y el valor sea una lista
        *
        *
        *  miMapa:
        *    "instrumentos de cuerda": [Instrumento("guitarra"), Instrumento("bajo")],
        *    "instrumentos de viento": [Instrumento("trompeta"), Intrumento("flauta")]
        *
        * */

    }

}
