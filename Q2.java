import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;

        int[] num = new int[5];

        for (int i=0;i<5;i++){
            System.out.println("digite um numero: ");
            num[i] = s.nextInt();
        }

        System.out.print("digite um numero pra ver se tem no vetor: ");
        int resp = s.nextInt();

            for (int i=0;i<5;i++) {
                if (resp == num[i]) {
                    System.out.printf("seu numero foi encontrado na posição %d %n",i);
                    contador++;
                }
                else {
                    if (i == 4 && contador == 0){
                        System.out.println("o numero não foi encontrado");
                    }

                }

            }

    }
}