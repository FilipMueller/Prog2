package Lektion17;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ex1Test {

    @Test
    public void numberFormatExceptionBeispielTest() {
        Exception exception = assertThrows(NumberFormatException.class, ex1::numberFormatExceptionBeispiel);
    }

    @Test 
    public void arrayIndexOutOfBoundsExceptionBeispielTest() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, ex1::arrayIndexOutOfBoundsExceptionBeispiel);
    }

    @Test
    public void nullPointerExceptionBeispielTest() {
        Exception exception = assertThrows(NullPointerException.class, ex1::nullPointerExceptionBeispiel);
    }

    @Test
    public void outOfMemoryErrorBeispielTest() {
        Error error = assertThrows(OutOfMemoryError.class, ex1::outOfMemoryErrorBeispiel);
    }

    @Test
    public void fileNotFoundExceptionBeispielTest() {
        Exception exception = assertThrows(FileNotFoundException.class, ex1::fileNotFoundExceptionBeispiel);
    }

    @Test
    public void arithmeticExceptionBeispielTest() {
        Exception exception = assertThrows(ArithmeticException.class, ex1::arithmeticExceptionBeispiel);
    }
}
