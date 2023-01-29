package Lektion16;

import Lektion16.ex3.StackWithAttribute;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class StackTest {

    @Test
    public void pushTest() {
        StackWithAttribute stack = new StackWithAttribute();
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");

        String poppedElement = stack.pop();
        assertEquals("element3", poppedElement);
        poppedElement = stack.pop();
        assertEquals("element2", poppedElement);
        poppedElement = stack.pop();
        assertEquals("element1", poppedElement);
        assertNull(stack.pop());

        stack.push("element1");
        stack.push("element2");
        List<String> test = new ArrayList<>();
        test.add("element1");
        test.add("element2");
        assertEquals(test, stack.getElements());
    }
}
