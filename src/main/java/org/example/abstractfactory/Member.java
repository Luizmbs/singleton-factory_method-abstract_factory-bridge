package org.example.abstractfactory;

import org.example.bridge.LoyaltyTier;

public class Member {

    private Contract contrato;
    private MembershipCard carteirinha;
    private String nome;
    private LoyaltyTier tier;

    public Member(AbstractFactory fabrica, String nome, LoyaltyTier tier) {
        this.contrato = fabrica.createContract();
        this.carteirinha = fabrica.createCard();
        this.nome = nome;
        this.tier = tier;
    }

    public String getNome() {
        return nome;
    }

    public LoyaltyTier getTier() {
        return tier;
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirCarteirinha() {
        return this.carteirinha.emitir();
    }
}
