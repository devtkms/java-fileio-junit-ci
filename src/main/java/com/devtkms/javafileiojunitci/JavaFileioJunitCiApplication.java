package com.devtkms.javafileiojunitci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This annotation marks this class as the entry point for the Spring Boot application
public class JavaFileioJunitCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaFileioJunitCiApplication.class, args);  // Start the Spring Boot application

        FileService fileService = new FileService();  // Create an instance of FileService
        try {
            // Create a new folder "outputDir" and a file "output.txt" inside it
            String directoryPath = "outputDir";  // Folder name
            String fileName = "output.txt";  // File name
            String content = "Hello, World in a new directory!";  // Content to write into the file

            // Create the folder and write the file
            fileService.writeFileInDirectory(directoryPath, fileName, content);

            // Read the file content from the folder
            String fileContent = fileService.readFileInDirectory(directoryPath, fileName);
            System.out.println("File Content: \n" + fileContent);  // Output the file content to the console
        } catch (Exception e) {
            e.printStackTrace();  // Print the stack trace if an exception occurs
        }
    }
}