import java.util.Scanner;
import java.util.SortedMap;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        
       int count = 0;
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero>maior) maior = numero;
            
            count++;
            
        } while(count < 5);
        System.out.println("Media: " + (soma/count) );
        System.out.println("Maior: " + maior);

    
    
    }
}
