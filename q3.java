import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int[] vetor = new int[5];
        int inicio = 0;
        int fim = vetor.length - 1;


        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = s.nextInt();
        }


        while (inicio < fim) {

            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;


            inicio++;
            fim--;
        }


        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }


    }
}
