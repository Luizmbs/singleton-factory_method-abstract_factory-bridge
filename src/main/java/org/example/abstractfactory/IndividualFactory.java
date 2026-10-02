package org.example.abstractfactory;

public class IndividualFactory implements AbstractFactory {

    @Override
    public Contract createContract() {
        return new IndividualContract();
    }

    @Override
    public MembershipCard createCard() {
        return new IndividualCard();
    }
}
