package one;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static String searchedWord;
    static String filePath = "src\\data\\dictionary.txt";

    public static void main(String[] args) {
        System.out.println("Enter any word");
        Scanner stringScanner = new Scanner(System.in);
        searchedWord = stringScanner.next().toLowerCase().trim();
        try {
            doFileExist(filePath);
        } catch (IOException e) {
            System.out.println("File Not Exist");
            throw new RuntimeException(e);
        }
    }

    public static void doFileExist(String filePath) throws IOException {
        Map<String, String> fileDictionary = new HashMap<String, String>();
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            String[] splitString = st.split("-");
            if (searchedWord.equalsIgnoreCase(splitString[0].toLowerCase().trim())) {
                fileDictionary.put(splitString[0].toLowerCase().trim(), splitString[1].toLowerCase().trim());
            }
        }

        if (fileDictionary.size() > 0) {
            for (Map.Entry<String, String> entry : fileDictionary.entrySet()) {
                if (searchedWord.equalsIgnoreCase(entry.getKey())) {
                    if (entry.getKey().contains(",")) {
                        System.out.println(entry.getValue());
                        String[] foundString = entry.getValue().split(",");
                        System.out.println(foundString[0]);
                        System.out.println(foundString[1]);
                    } else {
                        System.out.println(entry.getValue());
                    }
                }
            }
        } else {
            System.out.println("No Value found");
        }

    }
}