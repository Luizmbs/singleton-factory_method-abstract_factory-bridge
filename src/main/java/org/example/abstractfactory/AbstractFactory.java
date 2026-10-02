package org.example.abstractfactory;

public interface AbstractFactory {
    Contract createContract();
    MembershipCard createCard();
}
