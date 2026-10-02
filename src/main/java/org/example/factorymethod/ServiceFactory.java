package org.example.factorymethod;

public class ServiceFactory {
    public static Service obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.factorymethod." + servico + "Service");
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof Service)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (Service) objeto;
    }
}
