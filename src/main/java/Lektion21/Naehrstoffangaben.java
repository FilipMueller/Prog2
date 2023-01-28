package Lektion21;

public class Naehrstoffangaben {
    int portionsgroesse;
    int anzahlPortionen;
    int eiweiss;
    int kohelnhydrate;
    int natrium;
    int fett;

    private Naehrstoffangaben(int portionsgroesse, int anzahlPortionen, int eiweiss, int kohelnhydrate, int natrium, int fett) {
        this.anzahlPortionen = anzahlPortionen;
        this.portionsgroesse = portionsgroesse;
        this.eiweiss = eiweiss;
        this.kohelnhydrate = kohelnhydrate;
        this.natrium = natrium;
        this.fett = fett;
    }

    //Getter / Setter

    public static class Builder {
        int portionsgroesse;
        int anzahlPortionen;
        int eiweiss;
        int kohelnhydrate;
        int natrium;
        int fett;

        public Builder(int portionsgroesse, int anzahlPortionen) {
            this.portionsgroesse = portionsgroesse;
            this.anzahlPortionen = anzahlPortionen;
        }

        public Builder eiweiss(int eiweiss) {
            this.eiweiss = eiweiss;
            return this;
        }
        public Builder kohlenhydrate(int kohelnhydrate) {
            this.kohelnhydrate = kohelnhydrate;
            return this;
        }
        public Builder natrium(int natrium) {
            this.natrium = natrium;
            return this;
        }
        public Builder fett(int fett) {
            this.fett = fett;
            return this;
        }
        public Naehrstoffangaben build() {
            return new Naehrstoffangaben(portionsgroesse, anzahlPortionen, eiweiss, kohelnhydrate, natrium, fett);
        }
    }
}
