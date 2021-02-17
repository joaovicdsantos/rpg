package br.com.rpg;

import br.com.rpg.utils.Cores;
import br.com.rpg.utils.Outros;
import br.com.rpg.utils.Print;
import java.util.Scanner;

/**
 * <h1>App.</h1>
 * <p>
 * Classe principal do joguinho.
 * </p>
 *
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
     *
     * @param args - Recebe uma array de String.
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Outros.clearConsole();

        // Mensagem introdução
        Print.escreverColorido("\"O que você vê já foi um lugar que representou o equilíbrio.", Cores.CINZA,
                TEMPO_LEITURA_CURTO);
        Print.escreverColorido("Hoje, é totalmente o oposto disso...\"\n", Cores.CINZA, TEMPO_LEITURA_CURTO);
        Print.escreverColorido("~ Ancião desconhecido.", Cores.CINZA, TEMPO_LEITURA_MEDIO);

        Outros.clearConsole();

        // Início
        Print.escreverColorido("Floresta úmida de tempos de chuva.", Cores.AZUL);
        Print.escreverColorido("Ela, com um vestido branco e delicado,", Cores.AZUL);
        Print.escreverColorido("vaga por entre as árvores como o vento.", Cores.AZUL, TEMPO_LEITURA_LONGO);
        Print.escreverColorido("E de repente tudo some...", Cores.VERMELHO, TEMPO_LEITURA_CURTO);

        Outros.clearConsole();

        Print.escreverDialogo("????", "Ei, cara! Acorda!", "Vamos! É novo por aqui e já quer dormir na taverna?");

        Print.escrever("Assustado, você abre os olhos e levanta rapidamente.", TEMPO_LEITURA_CURTO);
        Print.escrever("O gosto doce do hidromel da noite passada ainda está na sua boca.", TEMPO_LEITURA_MEDIO);

        Print.escreverDialogo("????", "Por um momento achei que estivesse morto.",
                "Sou o Gorm, dono desse lindo muquifo.", "Qual seu nome mesmo?");

        String nome = leitura.nextLine();

        Print.escreverDialogo("Gorm", "Ah, claro!" + nome + ". Como que eu fui esquecer esse nome de merda?",
                "Normalmente não pergunto o nome dos meus clientes", "Prefiro ter uma relação mais \"impessoal\"",
                "Esses caras são durões, mas se você dá um espaço", "Eles choram igual um bebezinho no seu ombro.");
    }
}
