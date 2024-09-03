import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = s.nextInt();
        }

        int contadorPrimos = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (isPrimo(vetor[i])) {
                contadorPrimos++;
            }
        }

        System.out.printf("existem %d numeros primos no vetor", contadorPrimos);


    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

