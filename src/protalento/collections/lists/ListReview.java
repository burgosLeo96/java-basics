package protalento.collections.lists;

import java.util.*;
import java.util.regex.Pattern;

public class ListReview {

    public static void main(String[] args) {
        String [] miArreglo = new String[5];

        List<String> myList = new ArrayList<>();
        myList.add("First String");
        myList.add("Second String");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("First String");
        linkedList.add("Second String");

        String input = "Creativity is thinking-up new things. Innovation is doing new things!";
        Pattern pattern = Pattern.compile("\\W");
        StringBuilder res = new StringBuilder();
        Arrays
            .stream(input.split("((?=\\W)|(?<=\\W))"))
            .forEach(str -> {
                if (!pattern.matcher(str).matches()){
                    res.append(str.charAt(0))
                        .append(str.length() > 2 ? str.substring(1, str.length() - 1).chars().distinct().count() : "")
                        .append(str.charAt(str.length() - 1));
                }
                else {
                    res.append(str);
                }
            });

        System.out.println(res);

    }

}
