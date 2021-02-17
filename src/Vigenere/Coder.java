package Vigenere;

public class Coder {

    public String decipher(String cipher, String keyword){
        String message = "";
        char[] messageCharArray = cipher.toCharArray();
        char[] keywordCharArray = keyword.toCharArray();
        Shifter shifter = new Shifter();
        int index = 0;
        int alphabetDistance;
        int numberToShift;

        // For every character in cipher
        for (Character character : messageCharArray) {
            // Find out how far offset alphabet must be shifted
            numberToShift = keywordCharArray[index] - 'a';
            // Get shifted alphabet
            char[] shiftedAlphabetArray = shifter.shiftCharArrayRight("abcdefghijklmnopqrstuvwxyz".toCharArray(), numberToShift);
            // Find the "alphabetic distance" from a to the character
            alphabetDistance = character - 'a';
            // Append character from shifted alphabet to cipher string
            message += shiftedAlphabetArray[alphabetDistance];

            index++;
        }
        return message;
    }

    public String cipher(String message, String keyword){
        String cipher = "";
        char[] messageCharArray = message.toCharArray();
        char[] keywordCharArray = keyword.toCharArray();
        Shifter shifter = new Shifter();
        int index = 0;
        int alphabetDistance;
        int numberToShift;

        // For every character in message
        for (Character character : messageCharArray) {
            // Find out how far offset alphabet must be shifted
            numberToShift = keywordCharArray[index] - 'a';
            // Get shifted alphabet
            char[] shiftedAlphabetArray = shifter.shiftCharArrayLeft("abcdefghijklmnopqrstuvwxyz".toCharArray(), numberToShift);
            // Find the "alphabetic distance" from a to the character
            alphabetDistance = character - 'a';
            // Append character from shifted alphabet to message string
            cipher += shiftedAlphabetArray[alphabetDistance];

            index++;
        }
        return cipher;
    }

    public int getDistanceBetweenTwoLetters(char firstChar, char secondChar) {
        return secondChar - firstChar;
    }
}
