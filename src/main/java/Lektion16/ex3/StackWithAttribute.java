package Lektion16.ex3;

import java.util.List;

public class StackWithAttribute implements StackInterface {

    public String pop() {
        if (elements.isEmpty()) {
            return null;
        }
        String lastElement = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return lastElement;
    }

    public void push(String element) {
        elements.add(element);
    }

    public List<String> getElements() {
        return elements;
    }
}
