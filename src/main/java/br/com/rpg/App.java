package br.com.rpg;

import br.com.rpg.utils.Outros;
import br.com.rpg.utils.Print;

/**
 * <h1>App.</h1>
 * <p>
 * Classe principal do joguinho.
 * </p>
 * @author João Victor
 * @since 1.0
 */
public final class App {

    private static final long TEMPO_LEITURA_CURTO = 1000;
    private static final long TEMPO_LEITURA_MEDIO = 2000;
    private static final long TEMPO_LEITURA_LONGO = 3000;

    private App() {
    }

    /**
     * <h1>main()</h1>
     * <p>
     * Executa o projeto e mantém o loop.
     * </p>
     * @param args - Recebe uma array de String.
     */
    public static void main(String[] args) {

        Outros.clearConsole();

        Print.escrever("Midgard já foi um lugar que representou o equilíbrio...", TEMPO_LEITURA_CURTO);
        Print.escrever("Hoje, é totalmente o oposto disso...", TEMPO_LEITURA_LONGO);
        Print.escrever("TARAN RAN TAN TANN", TEMPO_LEITURA_MEDIO, 2);

    }
}
