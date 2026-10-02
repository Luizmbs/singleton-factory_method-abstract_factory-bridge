package org.example.factorymethod;

public class ReturnService implements Service {
    public String executar() {
        return "Devolução concluída";
    }

    public String cancelar() {
        return "Devolução cancelada";
    }
}
