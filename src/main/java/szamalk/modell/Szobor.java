package szamalk.modell;

import java.util.UUID;

public class Szobor extends Mukincs{
    private int szazad;
    private String anyag;

    public Szobor(UUID id, String alkoto, String cim, Kategoria kategoria, int szazad, String anyag) {
        super(id, alkoto, cim, kategoria);
        this.szazad = szazad;
        this.anyag = anyag;

        if(szazad > 21){
            throw new NemLetezoException("Nem készülhetett 21. században");
        }
    }

    public int getSzazad() {
        return szazad;
    }

    public String getAnyag() {
        return anyag;
    }
}
