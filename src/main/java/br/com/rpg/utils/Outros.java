package br.com.rpg.utils;

import java.io.IOException;

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
        final String os = System.getProperty("os.name");

        try {
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
            System.out.println("Houve um probleminha!");
        }

    }
}
