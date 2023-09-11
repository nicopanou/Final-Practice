package ExerciseOnDictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryReader {

	
	    // Method to check if a file exists at the given path
	    public static boolean doesFileExist(String path) {
	        try {
	            FileReader fileReader = new FileReader(path);
	            fileReader.close();
	            return true;
	        } catch (IOException e) {
	            return false;
	        }
	    }

	    // Method to read and print the words and their meanings from the file
	    public static void readAndPrintDictionary(String path) {
	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split("-");
	                if (parts.length == 2) {
	                    String word = parts[0].trim();
	                    String[] meanings = parts[1].split(",");
	                    System.out.println(word);
	                    for (String meaning : meanings) {
	                        System.out.println(meaning.trim());
	                    }
	                    System.out.println();
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        String filePath = "C:/Users/nicop/OneDrive/Desktop/MiniDictionary.txt"; // Replace with the actual file path

	        if (doesFileExist(filePath)) {
	            System.out.println("File exists at the specified path.");
	            System.out.println("Contents of the file:");
	            readAndPrintDictionary(filePath);
	        } else {
	            System.out.println("File does not exist at the specified path.");
	        }
	    }
	}




