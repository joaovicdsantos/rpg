package br.com.rpg.utils;

/**
 * <h1>Tempo.</h1>
 * <p>
 * Classe que contém funções utilitárias de tempo.
 * </p>
 * @see java.lang.Thread
 * @author João Victor
 * @since 1.0
 */
public final class Tempo {

    private Tempo() {
    }

    /**
     * <h1>sleep().</h1>
     * <p>
     * Serve para fazer o programa "dormir" por um determinado tempo
     * </p>
     * @param milissegundos - Indica quantos milissegundos o programar irá hibernar.
     */
    public static void sleep(long milissegundos) {
        try {
            Thread.currentThread().sleep(milissegundos);
        } catch (InterruptedException e) {
            System.out.println("Ocorreu um problema!");
        }
    }

}
