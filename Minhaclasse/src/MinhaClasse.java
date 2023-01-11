import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args){
        Scanner scan= new Scanner (System.in);

        String meuNome;

        System.out.println("Digite seu nome: ");
        meuNome = scan.next();
        
        System.out.println("O seu nome é: " + meuNome);
    }   
}
