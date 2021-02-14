package br.com.rpg.utils;

public class Print {

    private static final long TEMPO_PADRAO = 90;

    public static void escrever(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(Print.TEMPO_PADRAO);
        }
        System.out.println();
    }

    public static void escrever(String texto, long tempoLeitura) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(Print.TEMPO_PADRAO);
        }
        System.out.println();
        Tempo.sleep(tempoLeitura);
    }

    public static void escrever(String texto, long tempoLeitura, long tempoEscrita) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Tempo.sleep(tempoEscrita);
        }
        System.out.println();
        Tempo.sleep(tempoLeitura);
    }
    
}
