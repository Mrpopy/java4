import java.util.Arrays;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[3];
        int soma = 0;

        for (int i = 0;i<3;i++){
            System.out.println("escreva o " + (i+1)+ "° numero" );
            num[i] = s.nextInt();
            soma = soma+num[i];
        }
        System.out.println(Arrays.toString(num));
        System.out.println(soma);


    }
}