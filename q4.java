import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[5];
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = s.nextInt();
            cont = vetor[i] + cont;
        }

        double media = (double) cont / vetor.length;

        double somaQuadrados = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaQuadrados += Math.pow(vetor[i] - media, 2);
        }


        double variancia = somaQuadrados / vetor.length;


        double desvioPadrao = Math.sqrt(variancia);


        System.out.printf("a media é %d %n",cont);
        System.out.printf("O desvio padrão é: %.2f%n", desvioPadrao);


    }
}
