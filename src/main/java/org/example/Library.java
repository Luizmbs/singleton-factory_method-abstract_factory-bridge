package org.example;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.Member;
import org.example.bridge.LateFine;
import org.example.bridge.LoyaltyTier;
import org.example.factorymethod.Service;
import org.example.factorymethod.ServiceFactory;
import org.example.singleton.LibraryConfig;

public class Library {

    private static final float VALOR_MULTA_POR_DIA = 2.0f;

    public Member cadastrarMembro(AbstractFactory fabrica, String nome, LoyaltyTier tier) {
        return new Member(fabrica, nome, tier);
    }

    public String realizarEmprestimo(Member membro) {
        Service servico = ServiceFactory.obterServico("Loan");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        return servico.executar() + " para " + membro.getNome() + " (" + bibliotecario + ")";
    }

    public String realizarDevolucao(Member membro) {
        Service servico = ServiceFactory.obterServico("Return");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        return servico.executar() + " para " + membro.getNome() + " (" + bibliotecario + ")";
    }

    public String realizarCadastro(Member membro) {
        Service servico = ServiceFactory.obterServico("Register");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        return servico.executar() + " para " + membro.getNome() + " (" + bibliotecario + ")";
    }

    public String calcularMulta(Member membro, int diasAtraso) {
        LateFine multa = new LateFine(VALOR_MULTA_POR_DIA);
        multa.setTier(membro.getTier());
        multa.setDias(diasAtraso);
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        float valor = Math.round(multa.calcularValor() * 100) / 100.0f;
        return "Multa de atraso: R$" + valor + " para " + membro.getNome() + " (" + bibliotecario + ")";
    }
}
