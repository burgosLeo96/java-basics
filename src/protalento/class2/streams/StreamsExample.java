package protalento.class2.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static class MyClass {
        private final String name;
        private final String surename;
        private final int age;

        public MyClass(String name, String surename, int age) {
            this.name = name;
            this.surename = surename;
            this.age = age;
        }

        public String getName() { return this.name; }
        public String getSurename() { return this.surename; }
        public int getAge() { return this.age; }

    }

    public static void main(String[] args) {
        MyClass object1 = new MyClass("leonard", "burgos", 26);
        MyClass object2 = new MyClass("alejandra", "burgos", 18);
        MyClass object3 = new MyClass("richard", "", 19);
        MyClass object4 = new MyClass("daniela", "", 20);

        List<MyClass> myObjectList = List.of(object1, object2, object3, object4);

        myObjectList
                .forEach(element -> System.out.printf("My name is %s %s and I am %d years old%n", element.getName(), element.getSurename(), element.getAge()));


        List<Integer> myIntegerList =
                List.of(1, 2, 5, 7, 9, 10, 11, 12, 14, 16, 20, 22);

       /* var res = myIntegerList
                .stream()
                .map(i -> i + 2)
                .collect(Collectors.toList());

        res.forEach(System.out::println);*/

        List<Integer> oddElements;

        var res = myIntegerList
                .stream()
                .reduce(0, (accum, i) -> accum + i);

        System.out.println(res);

        //Java nuevo
        oddElements = myIntegerList
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        //Java viejo
        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();
        for(Integer i: myIntegerList){
            if(i % 2 == 0){
                listaPar.add(i);
            }
            else {
                listaImpar.add(i);
            }
        }

        Map<String, List<Integer>> mapaRespuesta = Map.of("par", listaPar, "impar", listaImpar);

        mapaRespuesta.forEach((key, value) -> {
            System.out.println(key + ": " +
            value
            .stream()
            .map(Object::toString)
            .collect(Collectors.joining(", ")));
        });

        System.out.println("\n");

        Map<Boolean, List<Integer>> mapaRespuesta2 = myIntegerList
            .stream()
            .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        mapaRespuesta2.forEach((key, value) ->
            System.out.println(key + ": " +
                    value
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")))
        );

        var oddSum = myIntegerList
                .stream()
                .filter(i -> i % 2 == 0) // [2, 10]
                .filter(i -> i < 14)
                .reduce(0, (accum, i) -> accum + i);

        //Java viejo
        /*for(Integer i: myIntegerList) {
            if(i % 2 == 0) {
                oddElements.add(i);
            }
        }*/

        /*System.out.println(oddSum);
        System.out.println(res);*/

        /*var average = myObjectList
                .stream()
                .reduce(0, (accum, item) -> accum + item.getAge(), Integer::sum);

        //System.out.printf("Average age: %d \n", average / myObjectList.size());

        Map<Boolean, List<MyClass>> myMap = myObjectList
                .stream()
                .collect(Collectors.partitioningBy(item -> item.getAge() > 19));

        //Java viejo
        List<MyClass> trueList = new ArrayList<>();
        List<MyClass> falseList = new ArrayList<>();
        for(MyClass obj: myObjectList) {
            if(obj.getAge() > 19){
                trueList.add(obj);
            }
            else {
                falseList.add(obj);
            }
        }

        Map<Boolean, List<MyClass>> resMap = new HashMap<>();
        resMap.put(true, trueList);
        resMap.put(false, falseList);

        myMap
            .forEach((key, value) ->
                    System.out.printf(key + ": " + value
                    .stream()
                    .reduce("", (partialString, item) -> partialString + item.getName() + " " + item.getSurename() + ", ", String::concat)));*/
    }

}
