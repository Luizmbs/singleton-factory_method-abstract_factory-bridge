package org.example.singleton;

public class LibraryConfig {

    private LibraryConfig() {};
    private static LibraryConfig instance = new LibraryConfig();
    public static LibraryConfig getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private String usuarioLogado;

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
