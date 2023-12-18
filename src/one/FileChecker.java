package one;

import java.io.File;
import java.io.IOException;

public class FileChecker {

	public static void main(String[] args) {
	
		 String filePath = "src\\one\\dictionary.txt"; 

	        try {
	            if (doesFileExist(filePath)) {
	                System.out.println("The file exists at the specified path.");
	            } else {
	                System.out.println("The file does not exist at the specified path.");
	            }
	        } catch (IOException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	    }

	    public static boolean doesFileExist(String path) throws IOException {
	        File file = new File(path);
	        return file.exists();
	        

	    }
	  
	    
}
