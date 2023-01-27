package Lektion15;

public class Student extends Person2{

    public Student(String fach) {
        super(fach);
    }

    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Der Student besucht das Fach " + this.fach);
    }
}
