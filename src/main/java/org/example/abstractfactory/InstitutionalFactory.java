package org.example.abstractfactory;

public class InstitutionalFactory implements AbstractFactory {

    @Override
    public Contract createContract() {
        return new InstitutionalContract();
    }

    @Override
    public MembershipCard createCard() {
        return new InstitutionalCard();
    }
}
