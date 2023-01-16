import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
       
        for(int i = 1; i <=10; i++) {
              System.out.println(tabuada * i + " = " + (tabuada) + "x" + (i));
        }



          /*  int multiplicador = 1;
        while(multiplicador <= 10) {
            System.out.println(tabuada * multiplicador);
            multiplicador++;
             */ 
            /* int multiplicador =1;
             do{
                System.out.println(tabuada * multiplicador);
                multiplicador++;
             }while(multiplicador <= 10);
             */
              
        
    }
}
