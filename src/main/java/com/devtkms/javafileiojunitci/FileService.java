package com.devtkms.javafileiojunitci;

import java.io.*;

public class FileService {

    /**
     * Creates the specified directory and saves the content in a file within it.
     *
     * @param directoryPath Path of the directory to create
     * @param fileName Name of the file to save
     * @param content Content to write into the file
     * @throws IOException If there is an error creating the directory or writing the file
     */
    public void writeFileInDirectory(String directoryPath, String fileName, String content) throws IOException {
        // Create the directory if it doesn't exist
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();  // Create all necessary parent directories
        }

        // Create the file path and write the content into the file
        File file = new File(directory, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }

    /**
     * Reads the content of a file within the specified directory and returns it as a string.
     *
     * @param directoryPath Path of the directory to read from
     * @param fileName Name of the file to read
     * @return Content of the file as a string
     * @throws IOException If there is an error reading the file
     */
    public String readFileInDirectory(String directoryPath, String fileName) throws IOException {
        // Create the file path and read the content
        File file = new File(directoryPath, fileName);
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;  // Variable to hold the line being read
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");  // Append each line with a newline character
            }
        }
        return content.toString();  // Return the file content as a string
    }
}