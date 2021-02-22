package Vigenere;

import java.io.FileNotFoundException;

public class Start {

    public static void main(String[] args) throws FileNotFoundException {

        Coder coder = new Coder();
        System.out.println(coder.decipher("rpoaxcnlazyshkjwlchhaky", "whiskywhiskywhiskywhisk"));
        System.out.println(coder.cipher("viginereshouldbebelasso", "whiskywhiskywhiskywhisk"));

    }
}
