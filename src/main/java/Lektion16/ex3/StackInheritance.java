package Lektion16.ex3;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object lastElement = get(size() - 1);
        remove(size() - 1);
        return lastElement;
    }

    public void push(String element) {
        add(element);
    }
}
