package br.com.rpg.utils;

/**
 * <h1>Cores.</h1>
 * <p>
 * Enum que contém todas as cores suportadas dentro do programa.
 * </p>
 * @author João Victor
 * @since 1.0
 */
public enum Cores {
    /**
     * <p>Cor vermelha.</p>
     */
    VERMELHO("31m"),
    /**
     * <p>Cor amarela.</p>
     */
    AMARELO("33m"),
    /**
     * <p>Cor verde.</p>
     */
    VERDE("32m"),
    /**
     * <p>Cor cinza.</p>
     */
    CINZA("37m"),
    /**
     * <p>Cor azul.</p>
     */
    AZUL("94m");

    private String codigo;

    Cores(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

}
