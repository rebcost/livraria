package entidades.constantes;

public enum Materias {

    M2(2),
    M5(5),
    M10(10);

    private double fator;

    Materias(double fator) {
        this.fator = fator;
    }

    public double getFator() {
        return fator;
    }

    public void setFator(double fator) {
        this.fator = fator;
    }
}
