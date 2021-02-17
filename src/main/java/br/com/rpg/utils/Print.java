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

    private static final long TEMPO_PADRAO = 70;
    private static final String CSI = "\u001B[";
    private static final String PREFIXO_DIALOGO = "\t - ";

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

    /**
     * <h1>escreverColorido()</h1>
     * <p>
     * Implementa cores na função de escrita.
     * </p>
     * @param texto        - Texto que será escrito
     * @param cor          - Define a cor de texto utilizada
     */
    public static void escreverColorido(String texto, Cores cor) {
        System.out.print(CSI + cor.getCodigo());
        escrever(texto);
        System.out.print(CSI + "m");
    }

    /**
     * <h1>escreverColorido()</h1>
     * <p>
     * Implementa cores na função de escrita.
     * </p>
     * @param texto        - Texto que será escrito
     * @param cor          - Define a cor de texto utilizada
     * @param tempoLeitura - O tempo que será reservado para a leitura da linha
     */
    public static void escreverColorido(String texto, Cores cor, long tempoLeitura) {
        System.out.print(CSI + cor.getCodigo());
        escrever(texto);
        System.out.print(CSI + "m");
        Tempo.sleep(tempoLeitura);
    }

    /**
     * <h1>escreverColorido()</h1>
     * <p>
     * Implementa cores na função de escrita.
     * </p>
     * @param texto        - Texto que será escrito
     * @param cor          - Define a cor de texto utilizada
     * @param tempoLeitura - O tempo que será reservado para a leitura da linha
     * @param tempoEscrita - Define o invervalo de tempo entre as letras
     */
    public static void escreverColorido(String texto, Cores cor, long tempoLeitura, long tempoEscrita) {
        System.out.print(CSI + cor.getCodigo());
        escrever(texto, 0, tempoEscrita);
        System.out.print(CSI + "m");
        Tempo.sleep(tempoLeitura);
    }

    /**
     * <h1>escreverDialogo()</h1>
     * <p>
     * Usa a função de escrever para escrever diálogos.
     * </p>
     * @param locutor      - O locutor do diálogo
     * @param texto        - Texto que será escrito
     */
    public static void escreverDialogo(String locutor, String... texto) {
        escrever("[" + locutor + "]");
        for (String fala : texto) {
            escrever(Print.PREFIXO_DIALOGO + fala);
        }
    }

    /**
     * <h1>escreverDialogo()</h1>
     * <p>
     * Usa a função de escreverColorido para escrever diálogos coloridos.
     * </p>
     * @param locutor      - O locutor do diálogo
     * @param texto        - Texto que será escrito
     */
    public static void escreverDialogoColorido(String locutor, Cores cor, String... texto) {
        escreverColorido("[" + locutor + "]", cor);
        for (String fala : texto) {
            escreverColorido(Print.PREFIXO_DIALOGO + fala, cor);
        }
    }

}
