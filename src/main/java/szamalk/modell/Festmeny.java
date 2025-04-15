package szamalk.modell;

import java.util.UUID;

public class Festmeny extends Mukincs{
    private String stilus;
    private String technika;

    public Festmeny(UUID id, String alkoto, String cim, Kategoria kategoria, String stilus, String technika) {
        super(id, alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getStilus() {
        return stilus;
    }

    public String getTechnika() {
        return technika;
    }
}
