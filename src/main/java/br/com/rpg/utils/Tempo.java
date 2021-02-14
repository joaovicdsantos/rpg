package br.com.rpg.utils;

public class Tempo {
    
    public static void sleep(long milissegundos) {
        try {
            Thread.currentThread().sleep(milissegundos);
        } catch (InterruptedException e) {
            System.out.println("Ocorreu um problema!");
        }
    }

}
