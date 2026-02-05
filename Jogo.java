import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogador j1 = new Jogador(1, "Aroldo");
        Jogador j2 = new Jogador(2, "Lucas");

        System.out.println("Ola heroi aqui voce tem algumas opcoes");

        System.out.printf("Quer ganhar pontos? (sim/nao)");
        String resposta = scan.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            j1.ganharPontos(10);
            j2.ganharPontos(10);
            System.out.println("Voce ganhou 10 pontos");
        } else {
            System.out.println("fique sem entao");
        }

        System.out.println("Voce se machucou (sim/nao)");
        String resposta1 = scan.nextLine();
        if (resposta1.equalsIgnoreCase("sim")) {
            j1.perderVida();
            j2.perderVida();
        } else {
            System.out.println("Continue sua jornada");
        }

        System.out.println("Voce precisa de ajuda (sim/nao)");
        String resposta2 = scan.nextLine();
        if (resposta2.equalsIgnoreCase("sim")) {
            j1.ganharVida();
            j2.ganharVida();
            System.out.println("Voce ganhou uma vida");
        } else {
            System.out.println("Continue entao");
        }

        System.out.println("Voce quer ver seus status (sim/nao)");
        String resposta3 = scan.nextLine();
        if (resposta3.equalsIgnoreCase("sim")) {
            j1.mostrarStatus();
            j2.mostrarStatus();
        } else {
            System.out.println("Continue entao");
        }
    }
}
