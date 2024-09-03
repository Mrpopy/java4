import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Digite o %dº número para o primeiro vetor: ", i + 1);
            vetor1[i] = s.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("Digite o %dº número para o segundo vetor: ", i + 1);
            vetor2[i] = s.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> comuns = new HashSet<>();

        for (int num : vetor1) {
            set1.add(num);
        }

        for (int num : vetor2) {
            if (set1.contains(num)) {
                comuns.add(num);
            }
        }

        System.out.println("Elementos comuns:");
        for (int num : comuns) {
            System.out.print(num + " ");
        }

        s.close();
    }
}
