import java.util.Scanner;

public class PBL011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro termo da PA: ");

        float a_1 = sc.nextFloat();

        System.out.println("Digite a razão da PA: ");

        float r = sc.nextFloat();

        System.out.println("Digite o número de termos da PA: ");

        int n = sc.nextInt();

        float a_n = a_1 + (n-1) * r;

        System.out.println("Último termo da PA: ");
        System.out.println(a_n);

        float S_n = (a_1 + a_n) * n / 2;

        System.out.println("Soma de todos os termos da PA: ");
        System.out.println(S_n);
    }
}