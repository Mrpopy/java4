import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetor1 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Digite o %dº número para o primeiro vetor: ", i + 1);
            vetor1[i] = s.nextInt();
        }

        int[] vetorSemDuplicatas = removeDuplicates(vetor1);

        System.out.println("Vetor sem duplicatas:");
        for (int num : vetorSemDuplicatas) {
            System.out.print(num + " ");
        }

        s.close();
    }

    public static int[] removeDuplicates(int[] vetor) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : vetor) {
            if (set.add(num)) {
                count++;
            }
        }

        int[] resultado = new int[count];
        int index = 0;
        for (int num : vetor) {
            if (set.contains(num)) {
                resultado[index++] = num;
                set.remove(num);
            }
        }

        return resultado;
    }
}

