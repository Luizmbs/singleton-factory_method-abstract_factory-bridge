package org.example.factorymethod;

public class LoanService implements Service {
    public String executar() {
        return "Empréstimo concluído";
    }

    public String cancelar() {
        return "Empréstimo cancelado";
    }
}
