import java.util.Scanner;

public class poligono {
    public static void main(String[] args){
   
        Scanner scan= new Scanner(System.in);
    int lados = 0;
    System.out.println("Me diga o numero de diagonais desse poligono: ");
    lados= scan.nextInt();

     int Nd= lados* (lados -3) /2;
     
     System.out.printf("Numeros de diagonais e igual a %d ",Nd);
     

    }
}


/*Faça um algoritmo que receba o número de lados
de um polígono convexo, calcule e mostre o número de
diagonais desse polígono. Sabe-se que ND = N* (N -
3)/2, onde N é o número de lados do polígono.*/













