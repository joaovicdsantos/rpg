package br.com.rpg.utils;

/**
 * <h1>Outros.</h1>
 * <p>
 * Classe que contém funções utilitárias gerais.
 * </p>
 * @author João Victor
 * @since 1.0
 */
public final class Outros {

    private Outros() {
    }

    /**
     * <h1>clearConsole().</h1>
     * <p>
     * Função para limpar o console
     * </p>
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
    }
}
