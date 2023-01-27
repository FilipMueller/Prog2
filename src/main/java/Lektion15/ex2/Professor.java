package Lektion15;

public class Professor extends Person2{

    public Professor(String fach) {
        super(fach);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Professor unterrichtet " + this.fach);
    }
}
