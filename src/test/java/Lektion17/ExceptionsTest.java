package Lektion17;

import Lektion17.ex1.Exceptions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTest {

    @Test
    public void numberFormatExceptionBeispielTest() {
        Exception exception = assertThrows(NumberFormatException.class, Exceptions::numberFormatExceptionBeispiel);
    }

    @Test 
    public void arrayIndexOutOfBoundsExceptionBeispielTest() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, Exceptions::arrayIndexOutOfBoundsExceptionBeispiel);
    }

    @Test
    public void nullPointerExceptionBeispielTest() {
        Exception exception = assertThrows(NullPointerException.class, Exceptions::nullPointerExceptionBeispiel);
    }

    @Test
    public void outOfMemoryErrorBeispielTest() {
        Error error = assertThrows(OutOfMemoryError.class, Exceptions::outOfMemoryErrorBeispiel);
    }

    @Test
    public void fileNotFoundExceptionBeispielTest() {
        Exception exception = assertThrows(FileNotFoundException.class, Exceptions::fileNotFoundExceptionBeispiel);
    }

    @Test
    public void arithmeticExceptionBeispielTest() {
        Exception exception = assertThrows(ArithmeticException.class, Exceptions::arithmeticExceptionBeispiel);
    }
}
