package Vigenere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public String createOneStringFromTextFile(String pathName) throws FileNotFoundException {
        File file = new File(pathName);
        String wholeText = "";
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            wholeText += sc.hasNext();
        }
        wholeText.replaceAll(" ", "");
        return wholeText;
    }

}
