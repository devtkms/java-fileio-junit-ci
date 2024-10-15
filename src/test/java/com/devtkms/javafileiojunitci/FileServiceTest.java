package com.devtkms.javafileiojunitci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class FileServiceTest {

    private final String testDirectory = "testDir";  // Test directory
    private final String testFileName = "test.txt";  // Test file name
    private final String testContent = "Test Content";  // Content for testing

    private FileService fileService;

    @BeforeEach
    public void setUp() {
        fileService = new FileService();  // Initialize FileService before each test
    }

    @AfterEach
    public void tearDown() {
        // Delete the created directory and file after each test
        File file = new File(testDirectory, testFileName);
        if (file.exists()) {
            file.delete();  // Delete the file
        }
        File directory = new File(testDirectory);
        if (directory.exists()) {
            directory.delete();  // Delete the directory
        }
    }

    @Test
    public void testWriteFileInDirectory() throws IOException {
        // Test the method that writes to a file
        fileService.writeFileInDirectory(testDirectory, testFileName, testContent);

        // Verify that the file and directory were created
        File file = new File(testDirectory, testFileName);
        assertTrue(file.exists(), "File should exist after write operation.");

        // Verify that the content of the file is correct
        String result = fileService.readFileInDirectory(testDirectory, testFileName);
        assertEquals(testContent + "\n", result, "File content should match the written content.");
    }

    @Test
    public void testReadFileInDirectory_FileNotFound() {
        // Verify that an IOException is thrown when trying to read a non-existent file
        assertThrows(IOException.class, () -> {
            fileService.readFileInDirectory(testDirectory, "nonexistent.txt");
        }, "Reading a non-existent file should throw IOException.");
    }
}