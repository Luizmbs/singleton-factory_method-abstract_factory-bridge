package org.example.factorymethod;

public class RegisterService implements Service {
    public String executar() {
        return "Registro feito";
    }

    public String cancelar() {
        return "Registro cancelado";
    }
}
