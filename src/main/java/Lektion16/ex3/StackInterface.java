package Lektion16.ex3;

import java.util.ArrayList;
import java.util.List;

public interface StackInterface {

    List<String> elements = new ArrayList<>();
    public String pop();
    public void push(String element);
    public List<String> getElements();
}
