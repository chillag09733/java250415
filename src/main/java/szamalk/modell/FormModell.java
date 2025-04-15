package szamalk.modell;

import java.io.Serializable;

public class FormModell implements Serializable {
    private boolean checkboxMozgat;

    public FormModell(){
        checkboxMozgat = false;
    }

    public boolean isCheckboxMozgat(){
        return checkboxMozgat;
    }

    public void setCheckboxMozgat(boolean checkboxMozgat){
        this.checkboxMozgat = checkboxMozgat;
    }
}
