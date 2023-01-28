package Lektion22;

import Lektion22.Baum.Knoten;

public interface Visitor<T>
{
    public void visit(Knoten<T> current);
}
