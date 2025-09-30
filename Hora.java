import java.util.Scanner;

public class Hora {
    public static void main(String[] args){

    int hora = 0, minutos =0;
    
    
    Scanner scan = new Scanner (System.in);

    System.out.println("Me diga uma hora: ");
    hora=scan.nextInt();

    System.out.println("Me diga quantos minutos: ");
    minutos=scan.nextInt();
    
    
    int HpM = hora * 60;
    int MpS = minutos * 60; 

    System.out.printf("Suas horas para minutos e igual a %d e seus minutos em segundos dao %d",HpM, MpS);










    }
}


