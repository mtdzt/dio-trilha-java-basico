import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPar = 0;
        int quantImpar = 0;



        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();
        

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantPar++;
            else quantImpar++;
            
            count++;


        }while(count < quantNumeros);

        System.out.println("Quantidades de Par: " + quantPar);

        System.out.println("Quantidade Impares: " + quantImpar);
    }
}
