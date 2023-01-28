package Lektion15.ex2;

public abstract class Person2 {

    String fach;

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public Person2(String fach) {
        this.fach = fach;
    }

    public abstract void gibTaetigkeitAus();
}
