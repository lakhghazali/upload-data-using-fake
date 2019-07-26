package Enumeration;

public enum EtatMateriel {
    NEUF("Neuf"),
    Occasion("Occasion"),
    SousEmballage("Sous emballage");

    private String label;

    EtatMateriel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
