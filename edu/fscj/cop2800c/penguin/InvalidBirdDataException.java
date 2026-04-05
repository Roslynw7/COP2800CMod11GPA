// InvalidBirdDataException.java
// R. Williams
// 4/05/2026
// A custom exception class used to handle invalid bird or penguin data

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}
