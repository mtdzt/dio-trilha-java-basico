public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, -10, 50, 4};
        
        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;

        }
        System.out.print("\n Vetor: ");
        for(int i = (vetor.length - 1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
