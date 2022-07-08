package protalento.class2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsMain {

    public static void main(String[] args) throws IOException {
        //UncheckedException example: divide by zero
        int divide = 5 / 0;
        System.out.println(divide);

        //CheckedException example: reading a file
        // Reading file from path in local directory
            FileReader file = new FileReader("C:\\test\\a.txt");

            // Creating object as one of ways of taking input
            BufferedReader fileInput = new BufferedReader(file);

            // Printing first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            // Closing file connections
            // using close() method
            fileInput.close();

    }

}
