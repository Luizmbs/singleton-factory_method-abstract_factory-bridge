package org.example.bridge;

public class LateFine extends Fine {

    private int dias;

    public LateFine(float valorBase) {
        super(valorBase);
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float calcularValor() {
        return this.valorBase * this.dias * (1 - this.tier.percentualDesconto());
    }
}
