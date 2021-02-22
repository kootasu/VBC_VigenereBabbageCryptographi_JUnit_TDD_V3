package Vigenere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoderTest {

    Coder coder = new Coder();
    String message = "viginereshouldbebelasso";
    String cipher = "rpoaxcnlazyshkjwlchhaky";
    String keyword = "whiskywhiskywhiskywhisk";

    @Test
    void decipher() {
        assertEquals(message, coder.decipher(cipher,keyword), "Deciphered message");
    }

    @Test
    void cipher() {
        assertEquals(cipher, coder.cipher(message,keyword), "Ciphered message");
    }

    @Test
    void getDistanceBetweenTwoLetters() {
        assertEquals(1, 'b' - 'a', "Distance between letter chars");
    }
}