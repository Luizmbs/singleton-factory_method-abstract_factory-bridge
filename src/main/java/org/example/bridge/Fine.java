package org.example.bridge;

public abstract class Fine {

    protected LoyaltyTier tier;

    protected float valorBase;

    public Fine(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setTier(LoyaltyTier tier) {
        this.tier = tier;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}
