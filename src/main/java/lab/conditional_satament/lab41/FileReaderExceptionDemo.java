package lab.conditional_satament.lab41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExceptionDemo {




        public static void main(String[] args) {
            String fileName = "example.txt";  // Specify the file name

            try {
                readFile(fileName);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        // Method to read a file and throw FileNotFoundException if the file is not found
        public static void readFile(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("File " + fileName + " not found.");
            }

            // Read and print file content
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
    }


