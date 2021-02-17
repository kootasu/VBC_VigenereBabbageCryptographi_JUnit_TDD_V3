package Vigenere;

public class Shifter {

    public char[] shiftCharArrayRight(char[] array, int numberToShift) {

        // Rotate the given array by numberToShift times toward right
        for (int i = 0; i < numberToShift; i++) {
            // Stores the last element of array
            char last = array[array.length - 1];
            // Shift element of array by one
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            // Adding last element of array to start of array
            array[0] = last;
        }
        return array;
    }

    public char[] shiftCharArrayLeft(char[] array, int numberToShift) {

        // Rotate the given array by numberToShift times toward right
        for (int i = 0; i < numberToShift; i++) {
            // Stores the first element of array
            char first = array[0];
            // Shift element of array by one
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            // Adding first element of array to end of array
            array[array.length - 1] = first;
        }
        return array;
    }
}