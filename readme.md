esse codigo pede para o aluno a resposta que ele colocou e compara com o gabarito fornecido 

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        final int tam = 5;
        char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
        char[] respostas = new char[tam];
        int nota = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            System.out.printf("Me diga a resposta da questao %d", i);
            respostas[i] = scan.nextLine().charAt(0);
        }
        for (int i = 0; i < tam; i++) {
            if (respostas[i] == gabarito[i]) {
                nota++;
            }
        }
        System.out.printf("%nNota do aluno: %d", nota);
    }
}