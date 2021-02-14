package br.com.rpg.utils;

/**
 * <h1>Print.</h1>
 * <p>
 * Classe que contém funções utilitárias de print.
 * </p>
 * @see br.com.rpg.utils.Tempo;
 * @author João Victor
 * @since 1.0
 */
public final class Print {

    private static final long TEMPO_PADRAO = 50;

    private Print() {
    }

    /**
     * <h1>escrever()</h1>
     * <p>
     * Função que simula a digitação/escrita.
     * </p>
     * @param texto - Texto que será escrito
     */
    public static void escrever(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(Print.TEMPO_PADRAO);
        }
        System.out.println();
    }

    /**
     * <h1>escrever()</h1>
     * <p>
     * Função que simula a digitação/escrita com tempo de leitura definido.
     * </p>
     * @param texto        - Texto que será escrito
     * @param tempoLeitura - O tempo que será reservado para a leitura da linha
     */
    public static void escrever(String texto, long tempoLeitura) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(Print.TEMPO_PADRAO);
        }
        System.out.println();
        Tempo.sleep(tempoLeitura);
    }

    /**
     * <h1>escrever()</h1>
     * <p>
     * Função que simula a digitação/escrita com tempo de leitura e escrita
     * definidos.
     * </p>
     * @param texto        - Texto que será escrito
     * @param tempoLeitura - O tempo que será reservado para a leitura da linha
     * @param tempoEscrita - Define o invervalo de tempo entre as letras
     */
    public static void escrever(String texto, long tempoLeitura, long tempoEscrita) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(tempoEscrita);
        }
        System.out.println();
        Tempo.sleep(tempoLeitura);
    }

}
