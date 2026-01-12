import java.util.Scanner;

public class nota {
 
    public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);
    int nota1=0, nota2=0;   
    int mediatotal = 7;
    System.out.println("Me diga sua primeira nota: ");
    nota1=scan.nextInt();
    System.out.println("Me diga sua segunda nota: ");
    nota2=scan.nextInt();
     
    int media= (nota1+nota2) / 2;

    if(media>=mediatotal){
        System.out.println("Aprovado");
    }
    else{
        System.out.println("Reprovado");
    }


    }
}


/*- Faça um algoritmo para calcular a média aritmética
entre duas notas de um aluno e informe seu status
(aprovado, reprovado). Um aluno é aprovado se sua
média for maior ou igual a 7. */